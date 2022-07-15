//https://www.codewars.com/kata/520b9d2ad5c005041100000f

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map(e -> e.matches("[,.?!:;]") ? e : e.substring(1, e.length()) + e.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool !"));
    }
}