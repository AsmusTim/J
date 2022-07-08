import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SpinWords {
    public String spinWords(String sentence) {
        StringBuilder res = new StringBuilder();

        if(!sentence.contains(" ")){
            StringBuilder mid = new StringBuilder(sentence);
            mid.reverse();
            res.append(mid);
        }else{
            String[] midArr = sentence.split(" ");

            for (String s : midArr) {
                if (s.length() > 4) {
                    StringBuilder mid = new StringBuilder(s);
                    mid.reverse();
                    res.append(mid).append(" ");
                }
                else{res.append(s).append(" ");}
            }
        }


        return res.toString().trim();
    }

    public static void main(String[] args) {
        System.out.print(new SpinWords().spinWords("Hey fellow warriors"));
    }
}
