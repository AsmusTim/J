import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int count = 0, in = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        while (in != -1){
            sum += in;
            in = sc.nextInt();
            count++;
        }
        System.out.print((float)sum/(count - 1));
    }
}
