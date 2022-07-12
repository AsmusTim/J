//https://www.codewars.com/kata/546e2562b03326a88e000020

import java.util.ArrayList;
import java.util.stream.Collectors;

public class SquareDigit {
    public int squareDigits(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(; n > 0; n /= 10, count++){
            list.add(n % 10);
        }

        list = (ArrayList<Integer>) list.stream().map(integer -> integer * integer).collect(Collectors.toList());

        n = 0;
        for(int i = 0, flag = 0; i < list.size(); ++i){
            n += list.get(i) * Math.pow(10, i + flag);
            if(list.get(i) > 10) flag++;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("\n" + new SquareDigit().squareDigits(9119));
    }
}
