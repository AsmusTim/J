//https://www.codewars.com/kata/55c04b4cc56a697bb0000048

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        for (String value : str2.split("")) {
            if (!str1.contains(value)) return false;
            else {str1 = str1.replaceFirst(value, "");}
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(scramble("sammoc","commas"));
    }

}
