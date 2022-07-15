//https://www.codewars.com/kata/55c6126177c9441a570000cc

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class WeightSort {

    public static class StrAndHerWeight implements Comparable<StrAndHerWeight>{
        public String s;
        public Integer len;
        public StrAndHerWeight(String s){
            this.s = s;
            this.len = Arrays.stream(s.split("")).mapToInt(Integer::parseInt).sum();
        }

        @Override
        public int compareTo(StrAndHerWeight o) {
            if(this.len.equals(o.len)) return this.s.compareTo(o.s);
            return this.len.compareTo(o.len);
        }
    }

    public static String orderWeight(String strng) {
        if(strng.equals("")) return strng;
        if(strng.equals(" ")) return strng;
        ArrayList<StrAndHerWeight> list = new ArrayList<>();
        for(String s: strng.split(" ")){
            list.add(new StrAndHerWeight(s));
        }
        Collections.sort(list);
        return list.stream().map(e -> e.s).collect(Collectors.joining(" "));

    }

    public static void main(String[] args) {
        System.out.println(WeightSort.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
    }

}
