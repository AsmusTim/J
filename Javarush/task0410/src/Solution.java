public class Solution {
    public static void main(String[] args) {
        checkInterval(56);
    }
    public static void checkInterval(int a){
        String s = (50 < a && a < 100) ? "Число а содержится в интервале." : "Число а не содержится в интервале.";
        System.out.print(s);
    }
}
