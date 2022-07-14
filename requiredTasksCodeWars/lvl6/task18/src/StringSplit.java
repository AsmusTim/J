//https://www.codewars.com/kata/515de9ae9dcfc28eb6000001

import java.util.Arrays;
public class StringSplit {
    public static String[] solution(String s) {
        if(s.length() % 2 == 1) s += "_";
        String[] res = new String[s.length() / 2];
        for(int i = 0, j = 0; i < s.length(); i += 2, ++j){
            res[j] = s.substring(i, i + 2);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(StringSplit.solution("abcde")));
    }
}