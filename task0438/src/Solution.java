public class Solution {
    public static void main(String[] args) {
        someFromEight();
    }
    public static void someFromEight(){
        for(int i = 0; i < 10; ++i){
            for(int j = 0; j < 10; ++j){
                if(j == 0){ System.out.print("8"); }
                else if(i == 9){ System.out.print("8"); }
                else{ System.out.print(" "); }
            }
            System.out.println();
        }
    }
}
