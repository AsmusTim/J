import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        copyAndCheckFile("test1.txt", "test2.txt");
    }

    public static void copyFile(String path1, String path2) throws IOException {
        Files.copy(Path.of(path1), Path.of(path2));
    }

    public static void copyAndCheckFile(String path1, String path2) throws IOException {
        if(Files.exists(Path.of(path1))){
            copyFile(path1, path2);
        }
        else{
            System.out.println("Файл не существует.");
            Scanner sc = new Scanner(System.in);
            String path = sc.nextLine();
            copyAndCheckFile(path, path2);
        }
    }

}
