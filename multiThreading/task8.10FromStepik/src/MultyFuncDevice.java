public class MultyFuncDevice {
    private static final Object scanMonitor = new Object();
    private static final Object printMonitor = new Object();

    public static void print(int countPage){
        synchronized (printMonitor){
            for(int i = 0; i < countPage; ++i){
                System.out.println("Printed " + (i + 1) + " pages");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void scan(int countPage){
        synchronized (scanMonitor){
            for(int i = 0; i < countPage; ++i){
                System.out.println("Scan " + (i + 1) + " pages");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
