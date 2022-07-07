public class Solution {
    public static String getUpperString(String s){
        char[] sArr = s.toCharArray();
        for(int i = 0; i < sArr.length; ++i){
            String toUpperCase = String.valueOf(sArr[i]).toUpperCase();
            if(i == 0){ sArr[i] = toUpperCase.toCharArray()[0]; }
            else if(sArr[i - 1] == ' '){ sArr[i] = toUpperCase.toCharArray()[0]; }
        }
        return String.valueOf(sArr);
    }
}
