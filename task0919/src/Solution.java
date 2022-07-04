public class Solution {
    public static void divisionByZero(){
        int a = 0 / 0;
    }

    public static void printStackTrace(){
        try {
            divisionByZero();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        printStackTrace();
    }
}
