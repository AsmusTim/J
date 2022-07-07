public class Solution {
    public static void main(String[] args) {
        tableMult();
    }
    public static void tableMult(){
        int i = 1;
        while(i < 10){
            int j = 1;
            while(j < 10){
                System.out.print("\t" + i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
