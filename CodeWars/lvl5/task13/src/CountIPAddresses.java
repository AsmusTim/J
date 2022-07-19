//https://www.codewars.com/kata/526989a41034285187000de4

import java.util.Arrays;

public class CountIPAddresses {

    public static long ipsBetween(String start, String end) {
        long[] ip1 = Arrays.stream(start.split("\\.")).mapToLong(Long::parseLong).toArray();
        long[] ip2 = Arrays.stream(end.split("\\.")).mapToLong(Long::parseLong).toArray();
        for(int i = 0; i < 4; ++i){
            ip1[i] = (long) (ip1[i] * Math.pow(256, 3 - i));
            ip2[i] = (long) (ip2[i] * Math.pow(256, 3 - i));
        }
        return Arrays.stream(ip2).sum() - Arrays.stream(ip1).sum();
    }

    public static void main(String[] args) {
        System.out.println(ipsBetween( "10.0.0.0", "10.0.0.50" ));
    }
}
