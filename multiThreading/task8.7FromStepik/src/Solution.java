import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Solution {

    public static final int size = 1_000_000;

    public static void main(String[] args) {
        //ExecutorService exeService = Executors.newFixedThreadPool(3); // first version. Time of work 29-39 ms
        ExecutorService exeService = Executors.newSingleThreadExecutor(); //second version. Time of work 38-66 ms
        CountDownLatch countDownLatch = new CountDownLatch(3);


        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i = 0; i < size; ++i){
                    if(i % 2 == 0) sum += i;
                }
                System.out.println("Sum all odd digit from range 0 - 10^6: " + sum);
                countDownLatch.countDown();
            }
        };

        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                int sum1 = 0;
                for(int i = 0; i < size; ++i){
                    if(i % 2 == 0) sum1 += i;
                }
                System.out.println("Sum all digit divided on seven from range 0 - 10^6: " + sum1);
                countDownLatch.countDown();
            }
        };
        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                ArrayList<Integer> list = new ArrayList<>();
                int count = 0;
                for(int i = 0; i < 1000; ++i){
                    list.add( (int)(Math.random() * 1001) );
                    if(list.get(i) % 2 == 0) count++;
                }
                System.out.println("Count odd digit from range 0-1000 random number : " + count);
                countDownLatch.countDown();
            }
        };

        long before = System.currentTimeMillis();
        exeService.execute(task1);
        exeService.execute(task2);
        exeService.execute(task3);
        exeService.shutdown();
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

}
