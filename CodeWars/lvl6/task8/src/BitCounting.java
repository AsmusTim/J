// link https://www.codewars.com/kata/526571aae218b8ee490006f4


public class BitCounting {

    public static int countBits(int n){
        int res = 0;
        while(n / 2 != 0){
            if(n % 2 == 1){res++;}
            n = n / 2;
        }
        if(n % 2 == 1) res++;
        return res;
    }

}