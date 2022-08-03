import java.util.concurrent.*;

public class Solution {

    public static void initArr(Integer[] arr){
        for(int i = 0; i < arr.length; ++i){
            arr[i] = (int) (Math.random() * 1000);
        }
    }


    public static void main(String[] args) {
        Integer[] arr = new Integer[50];
        initArr(arr);

        ExecutorService exeService = Executors.newFixedThreadPool(2);

        for(int i: arr){
            System.out.print(i + " ");
        }

        Future<Integer> findMin = exeService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int min = arr[0];
                for(int i: arr){
                    if(i < min) min = i;
                }
                return min;
            }
        });

        Future<Integer> findMax = exeService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int max = arr[0];
                for (Integer integer : arr) {
                    if (integer > max) max = integer;
                }
                return max;
            }
        });

        try {
            int a = findMin.get(), b = findMax.get();
            System.out.printf("\nmin: %d, max: %d", a, b);
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        exeService.shutdown();
    }

}
