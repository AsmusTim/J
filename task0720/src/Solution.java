import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        sc.nextLine(); //read char '\n' after input variable m

        for(int i = 0; i < n; ++i){
            list.add(sc.nextLine());
        }
        permStr(list, m);
        for(String i: list){System.out.println(i);}
    }

    public static void permStr(ArrayList<String> list, int m){
        for(int i = 0; i < m; ++i){
            list.add(list.get(0));
            list.remove(0);
        }
    }
}
