import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static Set<String> set;
    public static Set<Integer> setInt;

    public static void init(Set<Integer> set){
        for(int i = 0; i < 20; ++i){
            set.add(i);
        }
    }
    public static void delMoreTen(Set<Integer> set){
        int len = set.size();
        for(int i = 11; i < len; ++i){
            if(set.contains(i)) set.remove(i);
        }
    }

}
