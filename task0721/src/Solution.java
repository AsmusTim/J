import java.util.Scanner;

public class Solution {
    public static int[] arr = new int[20];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 20; ++i){
            arr[i] = sc.nextInt();
        }
        int[] rra = findeMinMax(arr);
        System.out.print(rra[0] + " " + rra[1]);
    }

    public static int[] findeMinMax(int[] arr){
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        int[] res = new int[2];
        for(int i = 0; i < arr.length; ++i){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        res[0] = min; res[1] = max;
        return res;
    }
}
