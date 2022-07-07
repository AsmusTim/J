import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static int[] initializeArray() throws IOException {
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 20; ++i){
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }
    public static int getMaxFromArray(int[] arr){
        int max = arr[0];
        for(int i = 1; i < arr.length; ++i){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        int[] arr = initializeArray();
        System.out.print(getMaxFromArray(arr));
    }
}
