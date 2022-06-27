import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.print(different(a, b, c));
    }
    public static int different(int a, int b, int c){
        if(a != b && a != c) return 1;
        if(b != a && b != c) return 2;
        if(c != a && c != b) return 3;
        return -1;
    }
}
