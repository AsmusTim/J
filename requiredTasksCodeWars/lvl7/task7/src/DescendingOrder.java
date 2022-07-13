//https://www.codewars.com/kata/5467e4d82edf8bbf40000155

import java.util.*;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        List<String> list = Arrays.stream(String.valueOf(num).split("")).sorted().toList();
        int res = 0;
        for(int i = 0; i < list.size(); ++i){
            res += Integer.parseInt(list.get(i)) * Math.pow(10, i);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(123));
    }
}