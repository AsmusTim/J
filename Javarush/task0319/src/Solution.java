import java.util.Scanner;

public class Solution {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        int count;
        int age;
        String name;

        name = sc.nextLine();
        try{
            Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            if(!sc.hasNextInt()){PrintError(); return;} count = sc.nextInt();
            if(!sc.hasNextInt()){PrintError(); return;} age = sc.nextInt();
            System.out.printf("%s  получает %d через %d", name, count, age);
            return;
        }
        PrintError();
    }
    public static void PrintError(){System.out.print("Что-то не так!");}
}
