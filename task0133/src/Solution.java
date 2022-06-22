public class Solution {
    public static void main(String[] str){
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }
    public static int getCountSecondsPassedInCurrentHour(int sec){
        return sec - (sec / 3600) * 3600;
    }
}
