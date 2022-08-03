public class Cashpoint {

        private int cash;

        public Cashpoint(int cash){
            this.cash = cash;
        }

        public void getMany(String name, int outCash){
            System.out.println(name + " come up to cashpoint");
            try{Thread.sleep(2000);} catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            if(outCash <= this.cash){
                try{Thread.sleep(100);} catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } //without additionally delay not have race condition
                this.cash -= outCash;
                System.out.println(name + " take " + outCash + ".");
                System.out.println("In cashpoint left " + this.cash);
            }
            else{System.out.println("In cashpoint no cash for " + name);}
        }
}


