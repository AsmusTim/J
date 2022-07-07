import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static ArrayList<Integer> list;
    public static LinkedList<Integer> linkList;

    public static long getTimeMsOfInsert(List list){
        long start = new Date().getTime();
        for(int i = 0; i < 100_000; ++i){
            list.add(i);
        }
        for(int i = 0; i < 10_000; ++i){
            list.add(0, i);
            list.get(i % 1000);
        }
        long end = new Date().getTime();
        return end - start;
    }

    public static List getListForGet() {
        return new ArrayList();
    }

    public static List getListForSet() {
        return new ArrayList();
    }

    public static List getListForAddOrInsert() {
        return new LinkedList();
    }

    public static List getListForRemove() {
        return new LinkedList();
    }
}
