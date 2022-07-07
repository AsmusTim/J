import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.print(quarter(x, y));
    }
    public static int quarter(int x, int y){
        if(x > 0 && y > 0) return 1;
        if(x < 0 && y > 0) return 2;
        if(x < 0 && y < 0) return 3;
        return 4;
    }
}
