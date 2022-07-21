//https://www.codewars.com/kata/52756e5ad454534f220001ef

import static java.lang.System.*;

public class Solution {

    public static String lcs(String x, String y) {
        String minStr = x.length() < y.length() ? x : y;
        String maxStr = x.length() >= y.length() ? x : y;
        int line = minStr.length(), column = maxStr.length();

        int[][] matrix = new int[line][column];
        int index = 0;
        for(int i = 0; i < line; ++i){
            for(int j = index; j < column; ++j){
                if(minStr.charAt(i) == maxStr.charAt(j)){
                    matrix[i][j] = 1;
                    index = j + 1;
                    break;
                }
                else matrix[i][j] = 0;
            }
        }

        StringBuilder lcs = new StringBuilder();
        index = 0;
        for(int i = 0; i < line; ++i){
            for(int j = index; j < column; ++j){
                if(matrix[i][j] == 1){
                    lcs.append(minStr.charAt(i));
                    index = j + 1;
                    break;
                }
            }
        }
        return lcs.toString();
    }



    public static void main(String[] args) {
        out.println(lcs("notttattteesttt", "nottest" ));
    }
}