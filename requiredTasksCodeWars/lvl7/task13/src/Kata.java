//https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9

import java.util.Arrays;

public class Kata {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}