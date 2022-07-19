import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
        listA.removeAll(listB);
        return listA.stream().mapToInt(e -> e).toArray();
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
    }
}