//https://www.codewars.com/kata/5667e8f4e3f572a8f2000039

public class Accumul {

    public static String accum(String s) {
        String[] strA = s.toLowerCase().split("");
        for(int i = 0; i < strA.length; ++i){
            strA[i] = strA[i].repeat(i + 1);
            strA[i] = strA[i].replaceFirst(strA[i].substring(0, 1), strA[i].substring(0, 1).toUpperCase());
        }
        return String.join("-", strA);
    }

    public static void main(String[] args) {
        System.out.println(accum("ZpglnRxqenU"));
    }
}