import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int sum = 0, in = 0;
        Scanner sc = new Scanner(System.in);

        while(in != -1){
            in = sc.nextInt();
            sum += in;
        }
        System.out.print(sum);
    }
}
