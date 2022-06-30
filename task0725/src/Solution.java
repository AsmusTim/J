public class Solution {
    public static final int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.getValue());
    }

    public int getValue() {
        return C;
    }
}
