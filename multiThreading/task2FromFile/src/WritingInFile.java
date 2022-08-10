import java.io.File;
import java.io.IOException;

public class WritingInFile {

    public static int[] initArr(){
        int size = (int)(Math.random() * 35);
        int[] arr = new int[size];
        for(int i = 0; i < size; ++i){
            arr[i] = (int)(Math.random() * 700);
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr1 = initArr();
        int[] arr2 = initArr();
        int[] arr3 = initArr();

        File file = new File("Task2FromFile.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Thread write1 = SaveAsThread.giveMeThread(file, arr1);
        Thread write2 = SaveAsThread.giveMeThread(file, arr2);
        Thread write3 = SaveAsThread.giveMeThread(file, arr3);

        write1.start();
        write2.start();
        write3.start();

        try {
            write1.join();
            write2.join();
            write3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Data is recorded in file");


    }

}
