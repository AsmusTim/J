//https://www.codewars.com/kata/52f787eb172a8b4ae1000a34

public class Solution {
    public static int zeros(int n) {
        int res = 0;
        while(n > 0) {
            n /= 5;
            res += n;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(zeros(14));
    }
}