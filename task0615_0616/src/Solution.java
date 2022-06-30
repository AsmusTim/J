public class Solution {

    /*=============*
     *= task 0615 =*
     *=============*/

    public static int A = 5;
    public int B = 2;
    public  int C = A * B;

    public static void main(String[] args) {
        A = 15; //task0615
        method1(); //task0616
    }

    /*=============*
     *= task 0616 =*
     *=============*/

    public static int step;


    public static void method1() {
        method2();
        return;
    }

    public static void method2() {
        new Solution().method3();
    }

    public void method3() {
        method4();
    }

    public void method4() {
        step++;
        for (StackTraceElement element : Thread.currentThread().getStackTrace())
            System.out.println(element);
        if (step > 1)
            return;
        main(null);
    }
}
