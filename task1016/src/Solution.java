import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, Integer> res = new HashMap<>();

    public static void countRepeatWords(String[] strArr){
        for(String st: strArr){
            if(res.containsKey(st)){
                int count = res.get(st) + 1;
                res.put(st, count);
            }
            else{
                res.put(st, 1);
            }
        }
        for(String s: res.keySet()){
            System.out.printf("%s: %d\n", s, res.get(s));
        }
    }

}
