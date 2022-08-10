import java.io.File;
import javax.swing.tree.DefaultMutableTreeNode;

public class FolderTree {

    public static void buildTree(File path, DefaultMutableTreeNode node){
        File[] files = path.listFiles();
        if(files == null){
            DefaultMutableTreeNode leaf = new DefaultMutableTreeNode(path.getName());
            node.add(leaf);
        }
        else {
            for(File f: files){
                if(f.getName().charAt(0) != '.') {
                    DefaultMutableTreeNode leaf = new DefaultMutableTreeNode(f.getName());
                    if (f.isFile()) {
                        node.add(leaf);
                    } else {
                        node.add(leaf);
                        buildTree(f, leaf);
                    }
                }
            }
        }

    }

}
