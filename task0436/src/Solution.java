import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        eightRect(m, n);
    }
    public static void eightRect(int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
