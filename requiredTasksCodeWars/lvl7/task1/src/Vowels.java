import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Vowels {

    public static long getCount(String str) {
        Long c = str.chars().boxed().collect(Collectors.groupingBy(o -> "101 117 111 97 105".contains(String.valueOf(o)), Collectors.counting())).get(true);
        return  c != null ? c : 0;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

}