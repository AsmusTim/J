//https://www.codewars.com/kata/54d512e62a5e54c96200019e


public class PrimeDecomp {

    public static String factors(int n) {
        StringBuilder res = new StringBuilder();
        int div = 2, count = 0;
        while(n > 1){
            if(n % div == 0){
                n /= div;
                count++;
            }
            else{
                if(count != 0){
                    res.append("(").append(div).append(count != 1 ? "**" + count : "").append(")");
                    div++;
                    count = 0;
                }
                else{ div++; }
            }
        }
        res.append("(").append(div).append(count != 1 ? "**" + count : "").append(")");

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(factors(7775460));
    }

}