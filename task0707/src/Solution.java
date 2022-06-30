import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> arList;
    public static ArrayList<String> arrList;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mama");
        list.add("Мыла");
        list.add("Раму");
        for(int i = 1; i < 7; i = i + 2){
            list.add(i, "именно");
        }
        for(String i: list){
            System.out.println(i);
        }


System.out.println();


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("роза");
        list1.add("лира");
        list1.add("лоза");
        list1.add("л");
        fix(list1);
        for(String i: list1){ System.out.println(i); }
    }
    public static void fix(ArrayList<String> list){
        int len = list.size();
        for(int i = 0; i < len; ++i){
            if(list.get(i).contains("р") && list.get(i).contains("л")){
                continue;
            }
            if(list.get(i).contains("р")){
                list.remove(i);
            }
            else if(list.get(i).contains("л")){
                list.add(list.get(i));
            }
        }
    }
}
