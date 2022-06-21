public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static double getMetreFromCentimetre(int centimetre) {
        return (int) centimetre/100;
    }
}