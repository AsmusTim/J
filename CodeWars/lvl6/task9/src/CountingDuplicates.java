//https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1

import java.util.stream.Collectors;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        return (int) text.toLowerCase().chars().boxed().collect(Collectors.groupingBy(k -> k, Collectors.counting())).values().stream().filter(e -> e > 1).count();
    }

    public static void main(String[] args) {
        System.out.print(new CountingDuplicates().duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzReturnsTwentySix"));
    }
}