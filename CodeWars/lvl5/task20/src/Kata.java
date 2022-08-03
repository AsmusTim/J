//https://www.codewars.com/kata/56c30ad8585d9ab99b000c54



import java.util.Arrays;

class Kata {

    public static String swapCase(String strForSwap, char chr){
        StringBuilder sb = new StringBuilder();
        char[] chars = strForSwap.toCharArray();
        for(char c: chars){
            if(Character.toLowerCase(c) == Character.toLowerCase(chr)){
                sb.append(Character.valueOf((char)(c ^ 32)));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String solution(String changeable, String changing){
        char[] chars = changing.toCharArray();
        Arrays.sort(chars);
        int countRepeat = 1;
        char checkedChar = chars[0];
        for (int i = 1; i < chars.length; ++i) {
            if (Character.toLowerCase(checkedChar) != Character.toLowerCase(chars[i])) {
                if (countRepeat % 2 == 1) {
                    changeable = swapCase(changeable, checkedChar);
                }
                checkedChar = chars[i];
                countRepeat = 1;
            } else {
                countRepeat++;
            }
        }
        if(countRepeat % 2 == 1){
            changeable = swapCase(changeable, checkedChar);
        }
        return changeable;
    }

    public static String workOnStrings(String a, String b) {
        a = solution(a, b);
        b = solution(b, a);
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(workOnStrings("abcdeFgtrzw", "defgGgfhjkwqe"));
        System.out.println("abcDeFGtrzWDEFGgGFhjkWqE");
    }
}//abcdeFgtrzw  defgGgfhjkwqe