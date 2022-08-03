public class Solution {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread print one begin run");
                MultyFuncDevice.print(4);
                System.out.println("Thread print one begin finish");
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                MultyFuncDevice.scan(3);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread print two begin run");
                MultyFuncDevice.print(4);
                System.out.println("Thread print two begin finish");
            }
        }).start();
    }

}
