import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        saysLove(name);
    }
    public static void saysLove(String n){
        for(int i = 0; i < 10; ++i){
            System.out.printf("%s любит меня.\n", n);
        }
    }
}
