import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        for(int i = 0; i < arr.length; ++i){
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.print(getMax(arr));
    }

    public static int getMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}
