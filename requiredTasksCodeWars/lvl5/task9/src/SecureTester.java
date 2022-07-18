//https://www.codewars.com/kata/526dbd6c8c0eb53254000110

public class SecureTester{

    public static boolean alphanumeric(String s){
        if(s.equals("")) return false;
        return s.replaceAll("[a-zA-Z0-9]", "").equals("");
    }

    public static void main(String[] args) {
        System.out.println(alphanumeric("emoji😊"));
    }

}