import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static char[] abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя".toCharArray();

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        init(map);
        String str;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; ++i){
            str = sc.nextLine();
            char[] str1 = str.toCharArray();

            for(int j = 0; j < str1.length; ++j){
                int count = map.get(str1[j]);
                count++;
                map.put(str1[j], count);
            }
        }
        for(int i = 0; i < abc.length; ++i){
            System.out.println(abc[i] + ": " + map.get(abc[i]));
        }
    }

    public static void init(Map<Character, Integer> map){
        for(int i = 0; i < 33; ++i){
            map.put(abc[i], 0);
        }
    }

}
