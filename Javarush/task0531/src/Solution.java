import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; ++i){
            int a = sc.nextInt();
            arr[i] = a;
        }
        System.out.print(getMin(arr));
    }

    public static int getMin(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
