//https://www.codewars.com/kata/55c45be3b2079eccff00010f

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Order {
    public static String order(String words) {
        if(words.equals("")) return "";

        String[] str = new String[9];
        for(String s: words.split(" ")){
            for(int i = 1; i < 10; ++i){
                int index = s.indexOf("" + i);
                if(index != -1){ str[i - 1] = s; break;}
            }
        }
        return Arrays.stream(str).filter(Objects::nonNull).collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));
    }
}