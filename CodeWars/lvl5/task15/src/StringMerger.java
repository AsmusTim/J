import java.util.Comparator;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        //s = s.replaceAll(" ", ""); part1 = part1.replaceAll(" ", ""); part2 = part2.replaceAll(" ", "");
        if(s.equals("") || s == null || part1 == null || part2 == null || (s.equals("") && part1.equals("") && part2.equals(""))) return false;
        if(s.length() != part1.length() + part2.length()) return false;

        int it = 0, itP1 = 0, itP2 = 0;
        while(it < s.length()){
            boolean equalsFlag = false;
            if(itP1 < part1.length() && s.charAt(it) == part1.charAt(itP1)){ // run to part1
                for(int i = 0; i < part1.length(); ++i){
                    char a = s.charAt(it + i), b = part1.charAt(itP1 + i);
                    if(!(a == b)){
                        it += i;
                        itP1 += i;
                        equalsFlag = true;
                        break;
                    }
                    if(itP1 + i == part1.length() - 1){
                        it += i + 1;
                        itP1 += i + 1;
                        equalsFlag = true;
                        break;
                    }
                }
            }
            if(equalsFlag) continue;
            if(itP2 < part2.length() && s.charAt(it) == part2.charAt(itP2)){ // run to part2
                for(int i = 0; i < part2.length(); ++i){
                    char a = s.charAt(it + i), b = part2.charAt(itP2 + i);
                    if(!(a == b)){
                        it += i;
                        itP2 += i;
                        equalsFlag = true;
                        break;
                    }
                    if(itP2 + i == part2.length() - 1){
                        it += i + 1;
                        itP2 += i + 1;
                        equalsFlag = true;
                        break;
                    }
                }
            }
            if(!equalsFlag) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isMerge("Can we merge it? Yes, we can!",
                "Cn emei? Ye, we!",
                "aw erg ts can"));
        StringBuilder s = new StringBuilder();
    }

}