import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        name = sc.nextLine(); age = sc.nextInt();
        adult(age);
    }
    public static void adult(int age){
        if(age < 18) System.out.print("Подрасти еще");
    }
}
