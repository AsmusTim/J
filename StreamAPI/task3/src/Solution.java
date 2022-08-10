import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> initList(boolean isEmpty){
        ArrayList<Integer> list = new ArrayList<>();
        if(!isEmpty){
            int size = (int)(Math.random() * 45 + 1);
            for(int i = 0; i < size; ++i){
                list.add( (int)(Math.random() * 96) );
            }
        }
        return list;
    }


    public static void main(String[] args) {
        ArrayList<Integer> list = initList(false);
        System.out.println(list);
        list.stream().skip( Math.max(0, list.size() - 1) ).findAny().ifPresentOrElse(System.out::println, () -> System.out.println("Empty")); // not empty list

        list = initList(true);
        list.stream().skip( Math.max(0, list.size() - 1) ).findAny().ifPresentOrElse(System.out::println, () -> System.out.println("Empty")); // empty list
    }

}
