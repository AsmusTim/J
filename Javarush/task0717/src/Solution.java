import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        doubleValues(list);
        for (String i: list){System.out.println(i);}
    }

    public static void doubleValues(ArrayList<String> list){
        int len = list.size() * 2;
        for(int i = 0; i < len; i += 2){
            list.add(i, list.get(i));
        }
    }
}
