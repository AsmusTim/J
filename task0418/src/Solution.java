import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.print(min(a, b));
    }
    public static int min(int a, int b){
        return (a <= b ? a : b);
    }
}
