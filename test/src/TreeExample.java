import javax.swing.*;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class TreeExample {

    public static ArrayList<DefaultMutableTreeNode> list = new ArrayList<>();


    public static void main(String[] args) {
        //new TreeExample();

        File home = new File("/home/user");
        DefaultMutableTreeNode root = new DefaultMutableTreeNode(home.getName());
        FolderTree.buildTree(home, root);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTree tree = new JTree(root);

        tree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if(node != null){
                    String[] path = tree.getSelectionPath().toString().replaceAll("[\\[\\]]", "").split(", ");


                    System.out.println(String.join("/", path));

                }

            }
        });

        frame.add(tree);
        frame.setSize(300,350);
        frame.setVisible(true);

    }
}