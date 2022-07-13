//https://www.codewars.com/kata/554b4ac871d6813a03000035

import java.util.Arrays;

public class Kata {
        public static String highAndLow(String numbers) {
            int[] arr = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).sorted().toArray();
            return "" + arr[arr.length - 1] + " " + arr[0];
        }


        public static void main(String[] args) {
            System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));

        }
    }
