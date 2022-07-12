import java.util.*;

public class RemoveDuplicates {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection){
        return new HashSet<>(collection).stream().toList();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(1);
        for(int i: removeDuplicates(list)){
            System.out.println(i);
        }
    }

}
