public class CashpointWithMonitorThis {

    private int cash;

    public CashpointWithMonitorThis(int cash){
        this.cash = cash;
    }

    public  synchronized void getMany(String name, int outCash){
        System.out.println(name + " come up to cashpoint");
        try{Thread.sleep(2000);} catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(outCash <= this.cash){
            this.cash -= outCash;
            System.out.println(name + " take " + outCash + ".");
            System.out.println("In cashpoint left " + this.cash);
        }
        else{System.out.println("In cashpoint no cash for " + name);}
    }

}
