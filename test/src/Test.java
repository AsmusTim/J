import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;

public class Test {

    private static final int WIDTH = 987;
    private static final int HEIGHT = 610;
    private static final Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
    private static JTextField textField;
    private static JTextArea text;

    private static class Button{
        public Button(String label, int offsetX, int offsetY, int width, int height, ActionListener l, JFrame frame){
            JButton Button = new JButton(label); //save
            Button.setBounds(offsetX, offsetY, width, height);
            Button.addActionListener(l);
            Button.setSize(width, height);
            frame.add(Button);
        }
    }

    public static void main(String[] args) {
        //main frame
        JFrame frame = new JFrame("MAIN FRAME");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //multiline text
        text = new JTextArea();
        text.setBounds(0, 30, (int)size.getWidth(), (int)size.getHeight());
        frame.add(text);

        //buttons
        new Button("Save", 0, 0, 80, 30, e -> System.out.println(text.getText()), frame);

        new Button("Open", 85, 0, 80, 30, e -> openFile(), frame);

        //text field
        textField = new JTextField();
        textField.setBounds(165, 0, 300, 30);
        frame.add(textField);

        //set frame on screen
        frame.setLayout(null);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }


    private static void openFile(){

            //create file tree
            File home = new File("/home/user");
            DefaultMutableTreeNode root = new DefaultMutableTreeNode(home.getName());
            FolderTree.buildTree(home, root);
            JTree tree = new JTree(root);
            tree.setBounds(0, 0, 100, 1000);
            tree.addTreeSelectionListener((TreeSelectionListener) e -> {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if (node != null) {
                    String[] path1 = tree.getSelectionPath().toString().replaceAll("[\\[\\]]", "").split(", ");
                    textField.setText(String.join("/", path1));
                }

            });

            //create frame for tree
            JFrame frame = new JFrame();
            frame.setSize(300, 350);

            //set all on frame and show him
            frame.add(tree);
            frame.setVisible(true);


            File file = new File(textField.getText());
            System.out.println(file.isFile());
            if (file.isFile()) {

                try (Reader reader = new BufferedReader(new FileReader(file))) {
                    int a = reader.read();
                    StringBuilder sb = new StringBuilder();
                    while (a != 0) {
                        sb.append((char) a);
                        a = reader.read();
                    }
                    text.setText(sb.toString());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }


    }


}
