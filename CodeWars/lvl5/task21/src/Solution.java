//https://www.codewars.com/kata/62e66bea9db63bab88f4098c


import java.math.BigInteger;
import java.util.Arrays;

public class Solution {

    /**
     * Base algorithm is inclusion and exclusion formula
    */


    /*********************************************************************************************
     * this method need for generate index for extract all combinations elements from input array
    */
    public static int[] generateCombination(int[] arr, int lenCombination, int maxNum){
        if(arr == null){
            arr = new int[lenCombination];
            for(int i = 0; i < lenCombination; ++i){
                arr[i] = i;
            }
            return arr;
        }

        for(int i = lenCombination - 1; i >= 0; --i){
            if(arr[i] < maxNum - lenCombination + i + 1){
                arr[i]++;
                for (int j = i; j < lenCombination - 1; j++)
                    arr[j + 1] = arr[j] + 1;
                return arr;
            }
        }
        return null;
    }

    public static BigInteger arifmeticProgression(BigInteger a1, BigInteger n){
        a1 = a1.add( a1.multiply(n) );
        a1 = a1.multiply(n);
        return a1.divide( BigInteger.valueOf(2) );
    }

    public String findThem(String numberLimit, int[] primes) {
        Arrays.sort(primes);

        BigInteger sum = BigInteger.valueOf(0);
        BigInteger limit = new BigInteger(numberLimit);

        for(long i: primes){ // count the amount occurrences for each i
            BigInteger bigI = BigInteger.valueOf(i);
            if(limit.compareTo(bigI) < 0) break;

            BigInteger n = limit.divide( bigI );
            if(limit.mod( bigI ).equals( BigInteger.valueOf(0) )) {
                n = n.subtract( BigInteger.valueOf(1) );
            }
            sum = sum.add( arifmeticProgression(bigI, n) );
        }

        if( sum.equals(BigInteger.valueOf(0)) ) return "0"; //if all digits great them numberLimit, then return 0

        //inclusion and exclusion formula
        for(int lenCombination = 2, degree = 1; lenCombination < primes.length + 1; ++lenCombination, ++degree){
            int[] combination = null;
            while ( (combination = generateCombination(combination, lenCombination, primes.length - 1)) != null){
                BigInteger mid = BigInteger.valueOf(1);
                boolean flag = false;

                for(int i: combination){//count the multiply all combinations from input array
                    mid = mid.multiply( BigInteger.valueOf( primes[i] ) );
                    if(mid.compareTo(limit) >= 0){ flag = true; break; } //if mid great them numberLimit, then stand flag
                }

                if(!flag) {
                    BigInteger n = limit.divide( mid );
                    if (limit.mod( mid ).equals( BigInteger.valueOf(0) )) {
                        n = n.subtract( BigInteger.valueOf(1) );
                    }

                    BigInteger midSum = arifmeticProgression(mid, n);
                    midSum = midSum.multiply( BigInteger.valueOf(-1).pow(degree) );
                    sum = sum.add( midSum );
                }
            }

        }

        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findThem("10", new int[]{3,5}).equals("23"));//23
        System.out.println(new Solution().findThem("10", new int[]{2,3,5}).equals("37"));//37
        System.out.println(new Solution().findThem("100000", new int[]{2,3,5,7,11,13,17,19,23,29}).equals("4209783663"));//4209783663
        System.out.println(new Solution().findThem("100000001", new int[]{2,3,5,7,11,13,17,19,23,29,31,37}).equals("4256395812485266"));//4256395812485266

//        int[] arr = null;
//        while ((arr = generateCombination(arr, 2, 1)) != null) {
//            System.out.println(Arrays.toString(arr));
//        }
    }
}