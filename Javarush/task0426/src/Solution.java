public class Solution {
    public static String even = "четное число";
    public static String odd = "нечетное число";
    public static String neg = "отрицательное";
    public static String pos = "положительное";

    public static void main(String[] args) {

    }

    public static void characterNumber(int a){
        if(a == 0){System.out.print("ноль"); return;}
        System.out.print((a < 0 ? neg : pos) + " " + (a % 2 == 0 ? even : odd));
    }
}
