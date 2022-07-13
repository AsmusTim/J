//https://www.codewars.com/kata/5390bac347d09b7da40006f6

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {

    public String toJadenCase(String phrase) {
        if(phrase == null || phrase.equals("")) return null;
        return Arrays.stream(phrase.split(" ")).map(e -> e.replace(String.valueOf(e.charAt(0)), String.valueOf(e.charAt(0)).toUpperCase())).
                collect(Collectors.joining(" ")).trim();
    }

    public static void main(String[] args) {
        System.out.println(new JadenCase().toJadenCase(""));
    }

}