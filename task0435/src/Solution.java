public class Solution {
    public static void main(String[] args) {
        printEven();
    }
    public static void printEven(){
        for(int i = 1; i < 101; ++i){
            if(i % 2 == 0){ System.out.println(i); }
        }
    }
}
