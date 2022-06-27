import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        trio(a, b, c);
    }
    public static void trio(int a, int b, int c){
        if(a == b && b == c){ System.out.printf("%d %d %d", a, b, c); return;}
        if(a == b){ System.out.printf("%d %d", a, b); return;}
        if(a == c){ System.out.printf("%d %d", a, c); return;}
        if(c == b){ System.out.printf("%d %d", b, c); }
    }
}
