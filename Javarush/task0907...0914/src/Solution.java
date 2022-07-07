import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        interceptionException2();
    }

    //task0907========================================
    public static void interceptionException(){
        try{
            int a = 42 / 0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }

    //task0908=======================================
    public static void interceptionException1(){
        try {
            String s = null;
            String m = s.toLowerCase();
        }
        catch (NullPointerException e){
            System.out.print("NullPointerException");
        }
    }

    //task0909====================================
    public static void interceptionException2(){
        try{
            int[] m = new int[2];
            m[8] = 5;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Index 8 out of bounds for length 2");
        }
    }
    //task0910=============================================
    public static void interceptionException3(){
        try {
            ArrayList<String> list = new ArrayList<String>();
            String s = list.get(18);
        }
        catch (IndexOutOfBoundsException e){
            System.out.print("Index 18 out of bounds for length 0");
        }

    }

    //task0911=====================================================
    public static void interceptionException4(){
        try {
            HashMap<String, String> map = new HashMap<String, String>(null);
            map.put(null, null);
            map.remove(null);
        }
        catch(NullPointerException e){
            System.out.print("Cannot invoke \"java.util.Map.size()\" because \"m\" is null");
        }
    }

    //task0912========================================================
    public static void interceptionException5(){
        try {
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        }
        catch (NumberFormatException e){
            System.out.print("For input string: \"XYZ\"");
        }
    }

    //task0913============================================================
    public static void interceptionException6(int a){
        try {
            if (a == 1) {
                throw new NullPointerException();
            }
            else{
                throw new FileNotFoundException();
            }
        }
        catch (NullPointerException e){
            System.out.print("NullPointerException");
        }
        catch (FileNotFoundException e){
            System.out.print("FileNotFoundException");
        }
    }

    //task0914===============================================
    public static class Exception1 extends Exception {
    }

    public static class Exception2 extends Exception1 {
    }

    public static class Exception3 extends Exception2 {
    }

    public static void method1(int a) throws Exception1, Exception2, Exception3 {
        if (a == 0)
            throw new Exception1();
        if (a == 1)
            throw new Exception2();
        if (a == 2)
            throw new Exception3();
    }

    public static void customerException(int a){
        try {
            method1(a);
        } catch (Exception1 exception1) {
            System.out.print("Exception1");
        }
    }
}
