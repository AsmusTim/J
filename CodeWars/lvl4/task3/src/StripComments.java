//https://www.codewars.com/kata/51c8e37cee245da6b40000bd


import java.util.*;

public class StripComments {
    
    public static String stripComments(String text, String[] commentSymbols) {
        String[] strs = text.split("\n");
        for(int i = 0; i < strs.length; ++i){
            for(String s: commentSymbols){
                if(strs[i].contains(s)){
                    strs[i] = strs[i].substring(0, strs[i].indexOf(s));
                }
                if(strs[i].length() > 0 && strs[i].charAt(strs[i].length() - 1) == ' '){
                    strs[i] = strs[i].substring(0, strs[i].length() - 1);
                }
                strs[i] = strs[i].trim().length() == 0 ? "" : strs[i];
            }
        }
        return String.join("\n", strs);
    }

    public static void main(String[] args) {
        System.out.println(stripComments( "a #b\nc\nd $e f g", new String[] { "#", "$" } ));
    }
}
