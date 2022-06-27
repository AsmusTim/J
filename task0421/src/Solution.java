import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine(), s2 = sc.nextLine();
        nasOrNast(s1, s2);
    }
    public static void nasOrNast(String s1, String s2){
        if(s1.equals(s2)){System.out.print("Имена идентичны");}
        else if(s1.length() == s2.length()){System.out.print("Длины имен равны");}
    }
}
