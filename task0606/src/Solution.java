import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print(getCountEvenOdd(a));
    }

    public static String getCountEvenOdd(int a){
        int even = 0, odd = 0;
        while(a != 0){
            if(a % 2 == 0) even++;
            else odd++;
            a /= 10;
        }
        return "even: " + even + " " + "odd: " + odd;
    }

}
