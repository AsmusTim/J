import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static HashMap<Integer, String> map = new HashMap<Integer, String>();
    public static Integer index;
    public static String name;


    public static void main(String[] args){
        Scanner intIn = new Scanner(System.in);
        Scanner strIn = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            int index = intIn.nextInt();

            String name = strIn.nextLine();
            map.put(index, name);
        }

        for (Map.Entry<Integer, String> pair : map.entrySet()) {
            index = pair.getKey();
            name = pair.getValue();
            System.out.println("Id=" + index + " Name=" + name);
        }
    }

}
