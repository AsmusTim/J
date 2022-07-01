import java.util.HashMap;
import java.util.Set;

public class Solution {
    public static HashMap<String, String> map;

    public static void init(HashMap<String, String> map){
        String[] keys = {"арбуз", "банан", "вишня", "груша", "дыня", "ежевика", "жень-шень", "земляника", "ирис", "картофель"};
        String[] value = {"ягода", "трава", "ягода", "фрукт", "овощ", "куст", "корень", "ягода", "цветок", "клубень"};
        for(int i = 0; i < 10; ++i){ map.put(keys[i], value[i]); }
    }

    public static void main(String[] args) {
        map = new HashMap<>();
        init(map);
        Set<String> keys = map.keySet();
        for(String s: keys){
            System.out.println(s + " - " + map.get(s));
        }
    }

}
