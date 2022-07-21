//https://www.codewars.com/kata/58223370aef9fc03fd000071

import java.util.ArrayList;

public class Solution {

    public static String dashatize(double number) {
        if(number % 1 != 0) return "";

        long num = (long)Math.abs(number);
        ArrayList<String> res = new ArrayList<>();
        char[] numStr = String.valueOf(num).toCharArray();
        if(numStr.length == 1) return "" + numStr[0];
        for(int i = 0; i < numStr.length; ++i){
            if((numStr[i] - '0') % 2 == 1){
                if(i == 0){res.add(numStr[i] + "-") ;}
                else if(i == numStr.length - 1){res.add("-" + numStr[i]);}
                else{
                    res.add("-" + numStr[i] + "-");
                }
            }
            else res.add("" + numStr[i]);
        }
        return String.join("", res).replaceAll("--", "-");
    }

    public static void main(String[] args) {
        System.out.println(dashatize(2147483648d));
    }

}