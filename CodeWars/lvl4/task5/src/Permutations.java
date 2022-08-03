import java.util.ArrayList;
import java.util.List;

class Permutations {
    public static ArrayList<String> list = new ArrayList<>();
    public static void perm(String s, int l, int len){
        if(l == len){ list.add(s); }
        else {
            for (int i = l; i < len; ++i) {
                s = swap(s, l, i);
                perm(s, l + 1, len);
                s = swap(s, l, i);
            }
        }
    }

    public static String swap(String s, int i, int j){
        char[] chr = s.toCharArray();
        char mid = chr[i];
        chr[i] = chr[j];
        chr[j] = mid;
        return String.valueOf(chr);
    }


    public static List<String> singlePermutations(String s) {
        perm(s, 0, s.length());
        return list.stream().filter(e -> e.length() == s.length()).distinct().filter(e -> e.matches("[" + s + "]+")).toList();
    }
/**
        if remove filter(e -> e.length() == s.length()).distinct().filter(e -> e.matches("[" + s + "]+") then check system don't accept solution
 **/

    public static void main(String[] args) {
        System.out.println(singlePermutations("imrstx"));
    }
}