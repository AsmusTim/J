import java.util.Scanner;

public class Solution {
    public static String threeDigit = "трехзначное число";
    public static String twoDigit = "двузначное число";
    public static String oneDigit = "однозначное число";
    public static String even = "четное";
    public static String odd = "нечетное";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        characterNumber(a);
    }

    public static void characterNumber(int a){
        if(a < 1 || a > 999){return;}
        System.out.print((a % 2 == 0 ? even : odd) + " " + (a / 100 != 0 ? threeDigit : (a / 10 != 0 ? twoDigit : oneDigit)));
    }

}
