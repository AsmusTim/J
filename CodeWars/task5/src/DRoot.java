public class DRoot {
    public static int digital_root(int n) {
        while(n / 10 != 0){
            int mid = n % 10;
            n = n / 10;
            n += mid;
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.print(digital_root(16));
    }
}