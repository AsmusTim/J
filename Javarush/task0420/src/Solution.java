import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; ++i){
            arr[i] = sc.nextInt();
        }
        bubble(arr);
        for(int i: arr){
            System.out.print(i + " ");
        }

    }
    public static void bubble(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            for(int j = 0; j < arr.length - 1; ++j){
                if(arr[j] < arr[j + 1]){
                    int mid = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = mid;
                }
            }
        }
    }
}
