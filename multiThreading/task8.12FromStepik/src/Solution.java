import java.util.concurrent.*;

public class Solution {

    public static String winner = "";
    public static long timeWinner = -1;


    public static void main(String[] args) throws InterruptedException {

        CountDownLatch countDownLatch1 = new CountDownLatch(10);
        CountDownLatch countDownLatch2 = new CountDownLatch(10);
        CountDownLatch countDownLatch3 = new CountDownLatch(10);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Semaphore semaphore = new Semaphore(3);

        final Object monitor = new Object();

            for(int i = 0; i < 10; ++i){
                final int index = i;
                executorService.execute(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep( (int)(Math.random() * 3500) );
                            Thread.currentThread().setName("Car" + index);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        String name = Thread.currentThread().getName();
                        System.out.println(name + " is ready");
                        countDownLatch1.countDown();
                        try {
                            countDownLatch1.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                        long start = System.currentTimeMillis();
                        partOne();
                        try{
                            semaphore.acquire();
                            inTunnel();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        } finally {
                            semaphore.release();
                        }
                        partTwo();

                        long finish = System.currentTimeMillis();

                        synchronized (monitor) {
                            if (timeWinner == -1){
                                winner = Thread.currentThread().getName();
                                timeWinner = finish - start;
                            }
                        }
                        countDownLatch2.countDown();
                        try{
                            countDownLatch2.await();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }


                        System.out.println(name + " finished with time " + (finish - start));
                        countDownLatch3.countDown();
                    }
                });


            }
            executorService.shutdown();
            countDownLatch3.await();

            System.out.println("Winner is " + winner + " time " + timeWinner);
    }

    public static void inTunnel(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " in tunnel");

        try {
            Thread.sleep( (int)(Math.random() * 5000 + 500) );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void partOne(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " on first part");

        try {
            Thread.sleep( (int)(Math.random() * 5000 + 1200) );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void partTwo(){
        String name = Thread.currentThread().getName();
        System.out.println(name + " on third part");

        try {
            Thread.sleep( (int)(Math.random() * 5000 + 1000) );
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
