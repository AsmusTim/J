import java.util.ArrayList;

public class Solution {
    public static int getLenMaxLine(ArrayList<Integer> list){
        int maxLen = 0, cur = list.get(0), len = 0;
        for(int i: list){
            if(i == cur){
                len++;
            }
            else{
                maxLen = Math.max(len, maxLen);
                cur = i;
                len = 1;
            }
        }
        return maxLen;
    }

}
