//https://www.codewars.com/kata/53dbd5315a3c69eed20002dd


import java.util.List;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(e -> e instanceof Integer).toList();
    }

    public static void main(String[] args) {
        System.out.println(filterList(List.of(1, 2, "e", "v")).toString());
    }
}
