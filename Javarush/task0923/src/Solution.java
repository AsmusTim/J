import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        getSplitString(str);
    }

    public static void getSplitString(String str){
        String symbol = "аяуюиыэеоё";
        char[] string = str.toCharArray();

        ArrayList<String> vowels = new ArrayList<>();
        ArrayList<String> consonants = new ArrayList<>();

        for(int i = 0; i < string.length; ++i){
            String c = String.valueOf(string[i]);
            if(c.equals(" ")) continue;
            else if(symbol.contains(c.toLowerCase())){vowels.add(c);}
            else{consonants.add(c);}
        }
        for(String v: vowels){System.out.print(v + " ");}
        System.out.println();
        for(String v: consonants){System.out.print(v + " ");}
    }

}

