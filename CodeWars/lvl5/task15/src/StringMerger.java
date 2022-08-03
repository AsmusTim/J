//https://www.codewars.com/kata/54c9fcad28ec4c6e680011aa


public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        if(s.equals("")){
            return part1.equals("") && part2.equals("");
        }
        else{
            boolean isMerge1 = false, isMerge2 = false;
            if(part1.length() > 0 && s.charAt(0) == part1.charAt(0)){
                isMerge1 = isMerge(s.substring(1), part1.substring(1), part2);
            }
            if(part2.length() > 0 && s.charAt(0) == part2.charAt(0)){
                isMerge2 = isMerge(s.substring(1), part1, part2.substring(1));
            }
            return isMerge1 || isMerge2;
        }
    }

    public static void main(String[] args) {
        System.out.print(isMerge(";8?[Ii+,?O8kzX]p6.2XTwai'!o*%EHCLi1^$2V<0t;8?[Ii+,?O8kzX]p6.2XTwai'!o3( #8)i`lnWM0UV.oJ8f\")IXc.2Mdjhf#q",
                ";8?[Ii+,?O8kzX]p6.2XTwai'!o3( #8)i`lnW",
                ";8?[Ii+,?O8kzX]p6.2XTwai'!o*%EHCLi1^$2V<0tM0UV.oJ8f\")IXc.2Mdjhf#q"));
    }

}