import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> mainList;
    public static ArrayList<Integer> forDiv3;
    public static ArrayList<Integer> forDiv2;
    public static ArrayList<Integer> forAny;

    public static void printList(){
        for(int i: forDiv3){
            System.out.println(i);
        }
        for(int i: forDiv2){
            System.out.println(i);
        }
        for(int i: forAny){
            System.out.println(i);
        }
    }
}
