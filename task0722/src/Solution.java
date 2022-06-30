import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String s = sc.nextLine();
        while (!s.equals("end")){
            list.add(s);
            s = sc.nextLine();
        }
        for(int i = 0; i < list.size(); ++i){
            System.out.println(list.get(i));
        }
    }
}
