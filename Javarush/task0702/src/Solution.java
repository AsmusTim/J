import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        String[] arr = new String[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 8; ++i){
            arr[i] = sc.nextLine();
        }

        for(int i = arr.length - 1; i > -1; --i){
            if(arr[i] != null){System.out.println(arr[i]);}
        }

    }
}
