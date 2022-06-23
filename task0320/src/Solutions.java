import java.util.Scanner;

public class Solutions {
    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        try {
            Integer.parseInt(name);
        }
        catch(NumberFormatException e){
            System.out.printf("%s зарабатывает 5 000$. Xa-xa-xa", name);
            return;
        }
        System.out.print("Что-то не так!");
        return;
    }
}
