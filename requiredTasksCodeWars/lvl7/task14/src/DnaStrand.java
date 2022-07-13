//https://www.codewars.com/kata/554e4a2f232cdd87d9000038

import java.util.HashMap;

public class DnaStrand {
    public static String makeComplement(String dna) {
        HashMap<String, String> m = new HashMap<>();
        m.put("A", "T");
        m.put("T", "A");
        m.put("C", "G");
        m.put("G", "C");
        StringBuilder sb = new StringBuilder();
        for(String s: dna.toUpperCase().split("")){
            sb.append(m.get(s));
        }
        return sb.toString();
    }
}