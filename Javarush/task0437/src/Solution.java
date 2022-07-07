public class Solution {
    public static void main(String[] args) {
        printEightTriangle();
    }
    public static void printEightTriangle(){
        for(int i = 1; i < 11; ++i){
            for(int j = 0; j < i; ++j){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
