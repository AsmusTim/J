//https://www.codewars.com/kata/52774a314c2333f0a7000688


public class Solution{

    public static boolean validParentheses(String parens)
    {
        int count = 0;
        for(String s: parens.replaceAll("[^()]", "").split("")){
            if(s.equals("(")){count++;}
            if(s.equals(")")){count--;}
            if(count < 0) return false;
        }
        return count == 0;
    }

    public static void main(String[] args) {
        System.out.println(validParentheses( "aaaa" ));
    }
}