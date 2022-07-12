//https://www.codewars.com/kata/52fba66badcd10859f00097e


import java.util.Arrays;

public class Troll {
    public static String disemvowel(String str) {
        char[] cStr = str.toCharArray();
        int offset = 0;
        for(int i = 0; i < cStr.length; ++i){
            if(!"euoaiEUOAI".contains(String.valueOf(cStr[i]))){ cStr[i - offset] = cStr[i]; }
            else{offset++;}
        }

        return String.valueOf(Arrays.copyOf(cStr, cStr.length - offset));
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("qwertyuiop"));
    }
}
