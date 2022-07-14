//https://www.codewars.com/kata/556deca17c58da83c00002db


import java.util.Arrays;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        if(n < 3) return Arrays.copyOf(s, n);
        if(n == 3) return s;
        double[] a = Arrays.copyOf(s, s.length + 1);
        a[a.length - 1] = a[a.length - 2] + a[a.length - 3] + a[a.length - 4];
        return tribonacci(a, --n);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Xbonacci().tribonacci(new double []{0,0,1},4)));
    }
}
