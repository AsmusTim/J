import java.util.Arrays;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        if(a.length < b.length) return new int[]{};
        int len = a.length;
        for(int i = 0; i < b.length; ++i){
            while(true){
                int index = Arrays.binarySearch(a, b[i]);
                if(index < 0) break;
                else{
                    a[index] = Integer.MIN_VALUE;
                    len--;
                }
            }
        }
        int[] res = new int[len];
        for(int i = 0, j = 0; i < a.length; ++i){
            if(a[i] != Integer.MIN_VALUE) res[j] = a[i]; j++;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.print(Arrays.toString(arrayDiff(new int [] {1,2,2}, new int[] {2})));
    }

}