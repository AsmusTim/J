

public class StringMerger {

    public static final Object monitor1 = new Object();
    public static void printPoint(int i){
        synchronized (monitor1) {

                if(i == 10){
                    try {
                    monitor1.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else { monitor1.notify(); }


            System.out.print(".");
        }
    }

    public static void main(String[] args) {

        final Object monitor2 = new Object();



        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                    try {
                        for (int i = 0; i < 25; i += 1) {
                            Thread.sleep(500);
                            printPoint(i);
                        }
                    } catch (InterruptedException e) {
                        //throw new RuntimeException(e);
                        System.out.println("I has been stop");
                    }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {


                    try {
                        for (int i = 0; i < 25; ++i) {
                            Thread.sleep(500);
                            System.out.print("o");
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
            }
        });

        thread1.start(); thread2.start();
        try {
            thread2.join();
            printPoint(11);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println();
        System.out.flush();
    }
}