import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = new int[20];
        for(int i = 0; i < 5; ++i){
            arr[i] = sc.nextInt();
        }
        getDecreasingLine(arr);
        for(int i: arr){ System.out.println(i); }

    }

    public static void getDecreasingLine(int[] arr){
        Arrays.sort(arr);
        int l = arr.length - 1;
        for(int i = 0; i < arr.length / 2; ++i){
            int mid = arr[i];
            arr[i] = arr[l - i];
            arr[l - i] = mid;
        }
    }
}
