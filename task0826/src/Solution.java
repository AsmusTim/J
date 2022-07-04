import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[20];
        for(int i = 0; i < 20; ++i){
            arr[i] = sc.nextInt();
        }
        printFirstMaxNum(arr);
    }

    public static void printFirstMaxNum(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < 5; ++i){
            System.out.println(arr[arr.length - 1 - i]);
        }
    }
}
