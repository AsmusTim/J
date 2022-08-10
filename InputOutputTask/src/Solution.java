import java.io.*;

public class Solution {

    public static void main(String[] args) {

        File dataDirect = new File("data");
            File lib = new File("data/lib");
            File environments = new File("data/environments");
            File pip = new File("data/pip");
                File example = new File("data/pip/example");
                File core = new File("data/pip/core");
                    File build = new File("data/pip/core/build");
        File remote = new File("remote");


        if(!dataDirect.isDirectory()){
            dataDirect.mkdir();
            lib.mkdir();
            environments.mkdir();
            build.mkdirs();
        }
        if(!remote.isDirectory()){
            remote.mkdir();
        }

        File main = new File("/home/user/Documents/J/InputOutputTask/src", "Solution.java");
        try {
            main.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(InputStream inputStream = new FileInputStream(main)){

            int a = inputStream.read();
            StringBuilder sb = new StringBuilder();
            while(a > 0){
                sb.append((char) a);
                a = inputStream.read();
            }
            System.out.println(sb);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //asd
    }

}
