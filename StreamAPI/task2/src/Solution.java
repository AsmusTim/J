import java.util.ArrayList;

public class Solution {

    public static ArrayList<Integer> initList(){
        ArrayList<Integer> list = new ArrayList<>();
        int size = (int)(Math.random() * 45 + 10);
        for(int i = 0; i < size; ++i){
            list.add( (int)(Math.random() * 100) );
        }
        return list;
    }

    public static void main(String[] args) {

        initList().stream().limit(1).findAny().ifPresentOrElse(System.out::println, () -> System.out.println(0) ); // print anything

        ArrayList<Integer> list = new ArrayList<>();
        list.stream().limit(1).findAny().ifPresentOrElse(System.out::println, () -> System.out.println(0)); // print zero
    }

}
