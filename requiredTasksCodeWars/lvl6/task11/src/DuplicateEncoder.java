//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c
import java.util.HashMap;


public class DuplicateEncoder {
    static String encode(String word){
        char[] str = word.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: str){
            if(map.containsKey(c)){
                int value = map.get(c) + 1;
                map.put(c, value);
            }
            else{
                map.put(c, 1);
            }
        }
        StringBuilder res = new StringBuilder();
        for(char c: str){
            if(map.get(c) > 1) res.append(")");
            else res.append("(");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(encode("Prespecialized"));
        System.out.println(")()())()(()()(");
    }
}