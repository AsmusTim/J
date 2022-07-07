import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; ++i){
            int a = sc.nextInt();
            arr[i] = a;
        }

        sort(arr);

        for(int i:arr){
            System.out.print(i);
        }
    }

    public static void sort(int[] arr){
        Arrays.sort(arr);
    }
}
