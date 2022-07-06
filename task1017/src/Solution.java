import java.util.ArrayList;

public class Solution {

    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue){
        try {
            return list.get(index);
        }catch (IndexOutOfBoundsException e){
            return defaultValue;
        }
    }
}
