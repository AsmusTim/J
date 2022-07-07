import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); int count = sc.nextInt();
        repeatStr(count, str);
    }
    public static void repeatStr(int c, String s){
        int i = 0;
        while(i < c){
            i++;
            System.out.println(s);
        }
    }
}
