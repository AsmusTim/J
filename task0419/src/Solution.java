import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        System.out.print(max(max(a, b), max(c, d)));
    }
    public static int max(int a, int b){ return a <= b ? b : a; }
}
