//https://www.codewars.com/kata/5552101f47fc5178b1000050

public class DigPow {

    public static long digPow(int n, int p) {
        String[] strN = String.valueOf(n).split("");
        int sum = 0;
        for(int i = p; i < p + strN.length; ++i){
            sum += Math.pow(Integer.parseInt(strN[i - p]), i);
        }
        return sum % n == 0? sum / n : -1;
    }

    public static void main(String[] args) {
        System.out.println(DigPow.digPow(46288, 3));
    }
}
