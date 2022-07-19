//https://www.codewars.com/kata/5282b48bb70058e4c4000fa7

import java.util.Arrays;

public class HexToRGB {

    public static int[] hexStringToRGB(String hex) {
        int[] arr = new int[3];

        for(int i = 1, j = 0; i < hex.length(); i += 2, j++){

            char[] color = hex.substring(i, i + 2).toLowerCase().toCharArray();
            for(int k = 0, p = 1; k < 2; ++k, p--){
                if('0' <= color[k] && color[k] <= '9'){
                    arr[j] += (color[k] - '0') * Math.pow(16, p);
                }
                else{ arr[j] += (color[k] - 'a'  + 10) * Math.pow(16, p); }
            }

        }
        return arr;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(hexStringToRGB("#beaded")));
    }
}