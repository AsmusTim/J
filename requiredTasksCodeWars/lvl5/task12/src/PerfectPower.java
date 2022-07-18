//https://www.codewars.com/kata/54d4c8b08776e4ad92000835

import java.util.Arrays;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        if(n < 4) return null;
        int[] res = new int[2];
        int N = n;
        for(int i = 2; i <= Math.sqrt(n); ++i){
            int pow = 0;
            while(N > 1){
                if(N % i == 0){
                    N /= i;
                    pow++;
                }
                else{ break; }
            }
            if(N == 1){
                res[0] = i;
                res[1] = pow;
                break;
            }
            N = n;
        }
        return res[1] == 1 || res[0] == 0? null : res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPerfectPower(8)));
    }
}