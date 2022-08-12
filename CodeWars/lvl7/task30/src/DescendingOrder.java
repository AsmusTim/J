import java.util.*;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        List<String> list = Arrays.stream(String.valueOf(num).split("")).sorted().collect(Collectors.toList());
        Collections.reverse(list);
        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s);
        }
        return Integer.parseInt(sb.toString());
    }

}