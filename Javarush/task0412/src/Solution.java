import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        a = a < 0 ? a + 1 : (a > 0 ? a *= 2 : 0);
        System.out.print(a);
    }
}
