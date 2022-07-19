//https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

class Persist {
    public static int persistence(long n) {
        int count = 0;
        while(n / 10 != 0){
            count++;
            char[] arr = String.valueOf(n).toCharArray();
            n = 1;
            for(char c: arr){
                n *= Integer.parseInt(String.valueOf(c));
            }
        }
        return count;
    }
}