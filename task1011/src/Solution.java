public class Solution {
    public static void main(String[] args) {
        String str = "Я не хочу изучать Java, я хочу большую зарплату";

        for(int i = 0; i < 40; ++i){
            System.out.println(str);
            str = str.substring(1);
        }
    }
}
