import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); int age = sc.nextInt();
        faceControl(age);
    }
    public static void faceControl(int age){
        if(age > 20) System.out.print("И 18-ти достаточно");
    }
}
