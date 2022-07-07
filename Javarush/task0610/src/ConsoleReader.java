import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReader {
    public static String readString() throws IOException {
        String bufferReader;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(reader);
        bufferReader = buff.readLine();
        return bufferReader;
    }
    public static int readInt() throws IOException {
        String bufferReader;
        int bufferIntReader;
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(reader);
        bufferReader = buff.readLine();
        bufferIntReader = Integer.parseInt(bufferReader);
        return bufferIntReader;
    }
    public static double readDouble() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(reader);
        String bufferReader = buff.readLine();
        return Double.parseDouble(bufferReader);
    }
    public static boolean readBoolean() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(reader);
        String bufferReader = buff.readLine();
        return Boolean.parseBoolean(bufferReader);
    }

    public static void main(String[] args) throws IOException {
        int a = readInt();
        System.out.print(a);
    }
}
