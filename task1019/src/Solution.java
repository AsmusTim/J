import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        ArrayList<String> arrStr = new ArrayList<>();
        ArrayList<Integer> arrInt = new ArrayList<>();
        while (true){
            String str = scStr.nextLine();
            if(str.equals("")) break;
            arrStr.add(str);

            int num = scInt.nextInt();
            arrInt.add(num);
        }


    }

    public static void printMap(ArrayList<Integer> arrInt, ArrayList<String> arrStr){
        for(int i = 0; i < arrInt.size(); ++i){
            map.put(arrStr.get(i), arrInt.get(i));
        }

        for(String s: map.keySet()){
            System.out.printf("%d %s", map.get(s), s);
            System.out.println();
        }
    }

}
