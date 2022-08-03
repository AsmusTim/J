public class Solution {

    public static final Object monitor = new Object();
    public static String nextLetter = "A";

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; ++i) {
                        try{
                            while(!nextLetter.equals("A")){
                                monitor.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("A");
                        nextLetter = "B";
                        monitor.notifyAll();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor) {
                    for (int i = 0; i < 5; ++i) {
                        try{
                            while(!nextLetter.equals("B")){
                                monitor.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("B");
                        nextLetter = "C";
                        monitor.notifyAll();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (monitor){
                    for (int i = 0; i < 5; ++i) {
                        try{
                            while(!nextLetter.equals("C")){
                                monitor.wait();
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        System.out.print("C");
                        nextLetter = "A";
                        monitor.notifyAll();
                    }
                }
            }
        }).start();

    }

}
