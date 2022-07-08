//https://www.codewars.com/kata/517abf86da9663f1d2000003

import java.lang.StringBuilder;
class Solution{

    static String toCamelCase(String s){
        String[] str = new String[0];
        if(s.contains("-")){str = s.split("-");}
        if(s.contains("_")){str = s.split("_");}

        StringBuilder res = new StringBuilder();
        for(int i = 0; i < str.length; ++i){
            if(i == 0 && 'a' <= str[i].charAt(0) && str[i].charAt(0) <= 'z'){
                res.append(str[i]);
                continue;
            }
            StringBuilder sb = new StringBuilder(str[i]);
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
            res.append(sb);
        }
        return res.toString();
    }
}