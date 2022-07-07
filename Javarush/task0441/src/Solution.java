import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.print(middleNumber(a, b, c));
    }
    public static int middleNumber(int a, int b, int c){
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return arr[1];
    }
}
