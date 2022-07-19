import java.util.Arrays;

public class FindOdd {
    public static int findIt(int[] a) {
        Arrays.sort(a);
        int odd = a[0];



        int current = a[0], count = 0, oddCount = 0;

        for(int i: a){
            if(i == current){ count++; }
            else{
                if(count % 2 == 1 && oddCount < count){
                    oddCount = count;
                    odd = current;
                    count = 1;
                    current = i;
                }
                else{
                    count = 1;
                    current = i;
                }
            }
        }

        if(oddCount == 0){
            odd = current;
        }

        return odd;
    }


    public static void main(String[] args) {
        System.out.print(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
    }
}