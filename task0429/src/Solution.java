import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countNeg = 0, countPos = 0;
        for(int i = 0; i < 3; ++i){
            int a = sc.nextInt();
            if(a < 0) countNeg++;
            if(a > 0) countPos++;
        }
        System.out.print("количество отрицательных чисел: " + countNeg +"\n" + "количество положительных чисел: " + countPos);
    }
}
