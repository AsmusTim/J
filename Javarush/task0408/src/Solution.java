public class Solution {
    public static void main(String[] args) {
        compare(2);
    }
    public static void compare(int a){
        if (a > 5) {
            print("Число больше 5");
        } else {
            if (a < 5) {
                print("Число меньше 5");
            } else {
                print("Число равно 5");
            }
        }
    }
    public static void print(String str){System.out.print(str);}
}
