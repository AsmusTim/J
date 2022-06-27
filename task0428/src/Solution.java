import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        for(int i = 0; i < 3; i++){
            int a = sc.nextInt();
            if(a > 0) count++;
        }
        System.out.print(count);
    }
}
