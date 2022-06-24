import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1 -> System.out.print("Понедельник");
            case 2 -> System.out.print("Вторник");
            case 3 -> System.out.print("Среда");
            case 4 -> System.out.print("Четверг");
            case 5 -> System.out.print("Пятница");
            case 6 -> System.out.print("Суббота");
            case 7 -> System.out.print("Воскресенье");
            default -> System.out.print("Такого дня недели не существует");
        }
    }
}
