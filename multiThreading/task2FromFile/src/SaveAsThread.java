import java.io.*;
import java.util.Arrays;

public class SaveAsThread {

    private static final Object monitor = new Object();

    public static Thread giveMeThread(File file, int[] arr){
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                writingArr(file, arr);
            }
        });
        return thread;
    }

    private static void writingArr(File file, int[] arr){
        synchronized (monitor){
            try(OutputStream out = new FileOutputStream(file, true)){
                out.write(Arrays.toString(arr).getBytes());
                out.write("\n".getBytes());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
