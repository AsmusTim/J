//https://www.codewars.com/kata/55908aad6620c066bc00002a

public class XO {

    public static boolean getXO (String str) {
        if(str.length() == str.toLowerCase().replaceAll("[xo]", "").length()){ return true; }
        str = str.toLowerCase().replaceAll("[^xo]", "");
        int x = 0, o = 0;
        for(String s: str.split("")){
            if(s.equals("x")) x++;
            else o++;
        }
        return x == o;
    }

    public static void main(String[] args) {
        System.out.println(getXO("xoo"));
    }
}