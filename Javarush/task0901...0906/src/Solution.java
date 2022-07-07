public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(method1()));
        System.out.println(Arrays.toString(method2()));
        System.out.println(Arrays.toString(method3()));
        System.out.println(Arrays.toString(method4()));
        System.out.println(Arrays.toString(method5()));
      method01();

        StackTraceElement[] ste = m1();
        System.out.println(ste.length); //output 10
    }

    //task0901============================
    public static StackTraceElement[] method1(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    public static StackTraceElement[] method2(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    public static StackTraceElement[] method3(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    public static StackTraceElement[] method4(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    public static StackTraceElement[] method5(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste;
    }

    //task0902===============================
    public static void method01(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0]);
        method02();
    }

    public static void method02(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0]);
        method03();
    }

    public static void method03(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0]);
        method04();
    }

    public static void method04(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0]);
        method05();
    }

    public static void method05(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0]);
    }

    //task0903========================================
    public static void method001(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0].getLineNumber());
        method002();
    }

    public static void method002(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0].getLineNumber());
        method003();
    }

    public static void method003(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0].getLineNumber());
        method004();
    }

    public static void method004(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0].getLineNumber());
        method005();
    }

    public static void method005(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[0].getLineNumber());
    }

    //task0904======================================
    public static StackTraceElement[] m1(){
        return m2();

    }
    public static StackTraceElement[] m2(){
        return m3();
    }
    public static StackTraceElement[] m3(){
        return m4();
    }
    public static StackTraceElement[] m4(){
        return m5();
    }
    public static StackTraceElement[] m5(){
        return m6();
    }
    public static StackTraceElement[] m6(){
        return m7();
    }
    public static StackTraceElement[] m7(){
        return m8();
    }
    public static StackTraceElement[] m8(){
        return Thread.currentThread().getStackTrace();
    }

    //task0905=====================================================
    public static int m01(){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        for(StackTraceElement s: ste){ System.out.println(s); }
        return ste.length;
    }

    //task0906====================================================
    public static void log(String msg){
        StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        System.out.println(ste[1].getClassName() + ": " + ste[2].getMethodName() + ": " + msg);
    }

}
