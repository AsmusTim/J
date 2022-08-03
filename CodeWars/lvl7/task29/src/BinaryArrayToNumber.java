//https://www.codewars.com/kata/578553c3a1b8d5c40300037c


import java.util.*;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        int res = 0;
        for(int p = 0, i = binary.size() - 1; p < binary.size(); ++p, --i){
            res += binary.get(i) * Math.pow(2, p);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println( ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0,0,0,1))) );

    Map

    }
}