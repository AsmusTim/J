//https://www.codewars.com/kata/55983863da40caa2c900004e


import java.util.Arrays;

public class Kata {

    public static void swap(char[] c, int i, int j){
        char mid = c[i];
        c[i] = c[j];
        c[j] = mid;

    }

    public static long nextBiggerNumber(long n) {
        int i;
        char[] chrRepresent = String.valueOf(n).toCharArray();
        int len = chrRepresent.length;
        for(i = len - 1; i > 0; --i){
            if(chrRepresent[i - 1] < chrRepresent[i]) break;
        }

        if(i == 0) return -1;

        int x = chrRepresent[i - 1], min = i;

        for(int j = i + 1; j < len; ++j){
            if(chrRepresent[j] > x && chrRepresent[j] < chrRepresent[min]) { min = j; }
        }
        swap(chrRepresent, i - 1, min);
        Arrays.sort(chrRepresent, i, len);
        return Long.parseLong(new String(chrRepresent));
    }

    public static void main(String[] args) {
        System.out.println(nextBiggerNumber(21475));
    }

}