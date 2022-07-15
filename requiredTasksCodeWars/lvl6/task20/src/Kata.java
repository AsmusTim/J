//https://www.codewars.com/kata/585d7d5adb20cf33cb000235

import java.util.Arrays;

public class Kata {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr);
        return arr[arr.length / 2] == arr[0] ? arr[arr.length - 1] : arr[0];
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0, 1, 0}));
    }
}