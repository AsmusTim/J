public class Solution {
    public static void getCountdown(){
        for(int i = 10; i > -1; --i){
            System.out.println(i);
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        getCountdown();
    }
}
