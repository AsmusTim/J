import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {
        System.out.print(getMinimum(getIntegerList()));
    }

    public static List<Integer> getIntegerList() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new LinkedList<>();
        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {
            list.add(Integer.valueOf(reader.readLine()));
        }
        return list;
    }

    public static int getMinimum(List<Integer> list){
        int min = list.get(0);
        for(int i: list){
            if(i < min){ min = i; }
        }
        return min;
    }

}
