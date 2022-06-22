public class Solution {
    public static void main(String[] str){
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(3));
    }
    public static int convertToSeconds(int hour){
        if(hour < 0) return 0;
        return hour * 3600;
    }
}
