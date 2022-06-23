import java.util.Scanner;

public class Solution {

    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        String name;
        int time;

        name = sc.nextLine();
        try{
            Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            if(!sc.hasNextInt()){PrintError(); return;} time = sc.nextInt();

            PrintAnsw(name, time);
            return;
        }
        PrintError();
    }
    public static void PrintError(){ System.out.print("Что-то не так!"); }
    public static void PrintAnsw(String n, int t){
        System.out.println(String.format("%s захватит мир через %d лет. Му-ха-ха", n, t));
    }
}
