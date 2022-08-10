import java.util.Arrays;


public class Solution {

    public static int[] initArr(){
        int size = (int)(Math.random() * 50 + 10);
        int[] arr = new int[size];
        for(int i = 0; i < size; ++i){
            arr[i] = (int)(Math.random() * 75);
        }
        return arr;
    }

    //counting the number occurrence

    public static void main(String[] args) {
        int[] arr = initArr();

        int occurrenceElement = (int)(Math.random() * 75);
        System.out.println(occurrenceElement);
        System.out.println(Arrays.toString(arr));

        long count = Arrays.stream(arr).filter(e -> e == occurrenceElement).count();
        System.out.println(count);
    }

}
