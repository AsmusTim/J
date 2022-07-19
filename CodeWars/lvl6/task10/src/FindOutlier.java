//https://www.codewars.com/kata/5526fc09a1bbd946250002dc

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindOutlier{
    static int find(int[] integers){
        return Arrays.stream(integers).boxed().collect(Collectors.partitioningBy((p) -> p % 2 == 0)).values().stream().filter(e -> e.size() == 1).toList().get(0).get(0);
    }


    public static void main(String[] args) {
        int[] exampleTest1 = {2,6,8,-10,3};
        System.out.print(find(exampleTest1));
    }
}