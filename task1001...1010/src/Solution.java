public class Solution {

    public static void main(String[] args) {
        method4();
    }

    public static void method(){
        int a = 0;
        int b = (byte) a + 46;
        byte c = (byte) (a * b);
        double f = (char) 1234.15;
        long d = (long) (a + f / c + b);
        System.out.println(d);
    }

    public static void method1(){
        int a = 15;
        int b = 4;
        float c = (float)a / b;
        double d = a * 1e-3 + c;

        System.out.println(d);
    }

    public static void method2(){
        float f = (float) 128.50;
        int i = (int) f;
        int b = (int) (i + (byte)f);
        System.out.println(b);
    }

    public static void method3(){
        short number = 9;
        char zero = '0';
        int nine = (zero + number);
        System.out.println((char)nine);
    }

    public static void method4(){
        int a = (byte) 44;
        int b = 300;
        short c = (short) (b - a);
        System.out.println(c);
    }

    public static void method5(){
        short b = 45;
        char c = 'c';
        short s = (short) 1005.22;
        int i = 150000;
        float f = 4.10f;
        double d = 1.256d;
        double result = (f * b) + (i / c) - (d * s) + 562.78d;
        System.out.println("result: " + result);
    }

    public static void method6(){
        long l = 111_1111_111_110L;
        int x =  0b1000_1100_1010;
        double m =  110_987_654_6299.123_34;
        float f =  l++ + 10 + ++x - (float) m;
        l = (long) f / 1000;
        System.out.println(l);
    }

    public static double method7(){
        int a = 50;
        int b = 17;
        double d = (double)a / b;
        return d;
    }

    public static double method8(){
        int a = 5;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = a + b / c / (double)e;
        return d;
    }

    public static double method9(){
        int a = 257;
        int b = 4;
        int c = 3;
        int e = 2;
        double d = (byte)a + b / c / e;

        return d;
    }
}