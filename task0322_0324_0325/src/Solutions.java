import java.util.Scanner;

public class Solutions {
    public static void main(String[] str){
        Scanner in = new Scanner(System.in);

        String n1, n2, n3; n1 = in.nextLine(); n2 = in.nextLine(); n3 = in.nextLine();
        task0322(n1, n2, n3);

        int n = in.nextInt();
        task0324(n);

        task0325();

    }
    public static void task0322(String n1, String n2, String n3){
        System.out.printf("%s + %s + %s = Чистая любовь, да-да!", n1, n2, n3);
        System.out.println();
    }
    public static void task0324(int n){
        System.out.printf("Я буду зарабатывать $ %d в час", n);
    }
    public static void task0325(){
        System.out.print("Я хочу большую зарплату, и для этого изучаю Java");
    }
}
