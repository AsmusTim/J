//https://www.codewars.com/kata/5208f99aee097e6552000148

import java.util.ArrayList;

class Solution {
    public static String camelCase(String input) {
        char[] str = input.toCharArray();
        ArrayList<String> res = new ArrayList<>();
        for(char c: str){
            if('A' <= c && c <= 'Z'){ res.add(" "); }
            res.add(String.valueOf(c));
        }
        return String.join("", res);
    }

    public static void main(String[] args) {
        System.out.println(camelCase("camelCasing"));
    }
}