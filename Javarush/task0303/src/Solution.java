public class Solution {
    public static void main(String[] str){
        System.out.println(convertEurToUsd(1));
        System.out.println(convertEurToUsd(2));
    }

    public static double convertEurToUsd(double eur){
        double course = 1.05;
        return eur * course;
    }
}
