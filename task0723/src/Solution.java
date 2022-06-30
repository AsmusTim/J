public class Solution {
    public static void getBoom() throws InterruptedException {
        int time = 30;
        while(time != 0){
            time--;
            System.out.println(time);
            Thread.sleep(100);
        }
        System.out.println("Boom!");
    }

    public static void main(String[] args) throws InterruptedException {
        getBoom();
    }
}
