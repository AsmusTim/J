import java.io.*;


public class Solution {

    public static void main(String[] args) {
        File mainPath = new File("main");

        try {
            mainPath.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String[] hierarchy;

        try(InputStream in = new FileInputStream(mainPath)){
            StringBuilder fromMain = new StringBuilder();
            int a = in.read();
            while(a > 0){
                fromMain.append((char) a);
                a = in.read();
            }
            hierarchy = fromMain.toString().split("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        File currentPath = null;
        int pathDepth = 0;
        for(String directory: hierarchy){
            File file;
            int lenWithDot = directory.length();
            directory = directory.replaceAll("\\.", "");
            int lenName = directory.length();
            int currentDepth = lenWithDot - lenName;

            if(currentDepth == 1){
                file = new File(directory);
                file.mkdir();
                currentPath = file;
                pathDepth = 1;
            }
            else{
                if(currentDepth > pathDepth){
                    file = new File(currentPath, directory);
                    file.mkdir();
                    currentPath = file;
                    pathDepth++;
                }
                else if(currentDepth < pathDepth){
                    while(pathDepth != currentDepth){
                        pathDepth--;
                        currentPath = currentPath.getParentFile();
                    }
                    file = new File(currentPath, directory);
                    file.mkdir();
                }
                else{
                    file = new File(currentPath.getParentFile(), directory);
                    file.mkdir();
                    currentPath = file;
                }
            }
        }


    }

}
