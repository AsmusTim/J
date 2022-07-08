import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Vowels {

    public static Map<Boolean, Long> getCount(String str) {
        return (Map<Boolean, Long>) str.chars().boxed().collect(Collectors.groupingBy(o -> "101 117 111 97 105".contains(String.valueOf(o)), Collectors.counting())).values();
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }

}