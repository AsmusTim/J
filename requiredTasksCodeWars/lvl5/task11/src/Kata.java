//https://www.codewars.com/kata/52e88b39ffb6ac53a400022e

import java.util.Arrays;
import java.util.stream.Collectors;


public class Kata {
    public static String longToIP(long ip) {
        long[] iP = new long[4];
        for(int i = 3; i > -1; --i){
            iP[i] = ip % 256;
            ip /= 256;
        }
        return Arrays.stream(iP).mapToObj(e -> String.valueOf(e)).collect(Collectors.joining("."));
    }

    public static void main(String[] args) {
        System.out.println(longToIP(2154959208L));
    }
}
