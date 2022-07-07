import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringHelper {
    public static String multiply(String s, int count){
        String buff = s;
        for(int i = 0; i < count - 1; ++i){
            s += buff;
        }
        return s;
    }
    public static String multiply(String s){
        String buff = s;
        for(int i = 0; i < 4; ++i){
            s += buff;
        }
        return s;
    }
}
