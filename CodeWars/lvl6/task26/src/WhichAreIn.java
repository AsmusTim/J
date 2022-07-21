//https://www.codewars.com/kata/550554fd08b86f84fe000a58

import java.util.ArrayList;
import java.util.Arrays;

public class WhichAreIn {

    public static String[] inArray(String[] array1, String[] array2) {
        ArrayList<String> res = new ArrayList<>();
        for(String s: array2){
            for(String sub: array1){
                if(s.contains(sub)){
                    res.add(sub);
                }
            }
        }
        return res.stream().sorted().distinct().toArray(String[]::new);
    }

    public static void main(String[] args) {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.print(Arrays.toString(inArray(a, b)));
    }
}
