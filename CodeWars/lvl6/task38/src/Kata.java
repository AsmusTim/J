//https://www.codewars.com/kata/5848565e273af816fb000449


public class Kata {
    public static String encryptThis(String text) {
        if(text.isEmpty()) return text;
        String[] str = text.split(" ");
        for(int i = 0; i < str.length; ++i){
            StringBuilder sb = new StringBuilder();
            char[] chr = str[i].toCharArray();
            sb.append((int) chr[0]);
            if(chr.length > 1) {
                char c = chr[1];
                chr[1] = chr[chr.length - 1];
                chr[chr.length - 1] = c;
                sb.append(chr, 1, chr.length - 1);
            }
            str[i] = sb.toString();

        }
        return String.join(" ", str);
    }

    public static void main(String[] args) {
        System.out.println(encryptThis("ac"));



    }
}