import java.util.*;

public class Solution {
    public static List<String> list;

    public static void main(String[] args) {
        list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str;
        while (true){
            str = sc.nextLine();
            if(str.equals("")) { break; }
            list.add(str);
        }
        sortList(list);
    }

    public static void sortList(List<String> list){
        Collections.sort(list);
        for(String s: list){ System.out.println(s); }
    }
}
