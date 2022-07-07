import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) {
        System.out.print(closeToTen(5, 5));
    }

    public static int closeToTen(int a, int b){
        return abs(a - 10) <= abs(b - 10) ?  a :  b;
    }
}
