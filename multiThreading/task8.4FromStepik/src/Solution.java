public class Solution {

    public static void main(String[] args) {

        //Cashpoint atm = new Cashpoint(1000); //first solution
        //CashpointWithMonitorThis atm = new CashpointWithMonitorThis(1000); //second solution
        CashpointWithMonitorObject atm = new CashpointWithMonitorObject(1000); //third solution

        Thread thread1Tom = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.getMany("Tom", 500);
            }
        }); // 500

        Thread thread2Sara = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.getMany("Sara", 500);
            }
        }); // 500

        Thread thread3Jams = new Thread(new Runnable() {
            @Override
            public void run() {
                atm.getMany("Jams", 400);
            }
        }); // 400

//first solution

//        try {
//            thread1Tom.start();
//            thread1Tom.join();
//            thread2Sara.start();
//            thread2Sara.join();
//            thread3Jams.start();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        //System.out.println(Cashpoint.cash);


        thread1Tom.start();
        thread2Sara.start();
        thread3Jams.start();



    }

}
