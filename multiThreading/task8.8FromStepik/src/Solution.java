import java.util.concurrent.*;

public class Solution {

    public static void main(String[] args) {
        ExecutorService exeService = Executors.newFixedThreadPool(2, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
        exeService.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        System.out.print(".");
                        Thread.sleep(300);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Future<Integer> futureAge = exeService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(3000);
                return 23;
            }
        });
        Future<String> futureName = exeService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(3500);
                return "Tom";
            }
        });

        String name;
        int age;
        try {
            name = futureName.get();
            age = futureAge.get();
        } catch (ExecutionException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        exeService.shutdown();

        System.out.println("\nName " + name + ". Age " + age);

    }
}
