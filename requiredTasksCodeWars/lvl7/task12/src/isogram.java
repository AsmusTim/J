//https://www.codewars.com/kata/54ba84be607a92aa900000f1

import java.util.HashMap;

public class isogram {
    public static boolean  isIsogram(String str) {
        HashMap<Character, Integer> m = new HashMap<>();
        for(char c: str.toLowerCase().toCharArray()){
            if(!m.containsKey(c)){m.put(c, 0);}
            else{return false;}
        }
        return true;
    }
}