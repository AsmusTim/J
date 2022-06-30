import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> list;

    public static int increaseLen(ArrayList<String> list){
        for(int i = 1; i < list.size(); ++i){
            if(list.get(i - 1).length() > list.get(i).length()){return i;}
        }
        return -1;
    }
}
