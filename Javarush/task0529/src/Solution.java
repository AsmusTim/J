import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        try{
            while (true) {
                int a = sc.nextInt();
                list.add(a);
            }
        }
        catch (InputMismatchException e){
            System.out.print(getSum(list));
        }

    }

    public static int getSum(ArrayList<Integer> list){
        int sum = 0;
        for(int i: list){
            sum += i;
        }
        return sum;
    }
}
