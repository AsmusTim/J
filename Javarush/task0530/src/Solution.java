import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(getSum(a, b));
    }
    public static int getSum(int a, int b){return a + b;}
}
