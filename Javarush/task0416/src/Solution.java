import java.util.Scanner;

import static java.lang.Math.abs;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble();
        threeColor(t);
    }
    public static void threeColor(double time) {
        time = abs(time);
        if ((int) time % 5 <= 2) {
            System.out.print("зелёный");
        } else if ((int) time % 5 == 3) {
            System.out.print("желтый");
        } else {
            System.out.print("красный");
        }
    }
}
