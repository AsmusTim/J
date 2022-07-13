//https://www.codewars.com/kata/56747fd5cb988479af000028

class Kata {
    public static String getMiddle(String word) {
        char[] chr = word.toCharArray();
        if(word.length() % 2 == 0){
            return "" + chr[(word.length() / 2) - 1] + "" + chr[(word.length() / 2)];
        }else{ return "" + chr[word.length() / 2]; }
    }
}