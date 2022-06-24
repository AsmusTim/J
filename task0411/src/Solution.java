public class Solution {
    public static void main(String[] args) {
        checkSeason(1);
    }
    public static void checkSeason(int a){
        if(1 <= a && a <= 2 || a == 12){System.out.print("Зима");}
        if(3 <= a && a <= 5){System.out.print("Весна");}
        if(6 <= a && a <= 8){System.out.print("Лето");}
        if(9 <= a && a <= 11){System.out.print("Осень");}
    }
}
