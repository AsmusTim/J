import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static ArrayList<String> list;

    public static void main(String[] args){
        list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String k = sc.nextLine();
        while(!k.equals("")){
            list.add(k);
            k = sc.nextLine();
        }


        for(String i: getChangeList(list)){
            System.out.println(i);
        }
    }

    public static ArrayList<String> getChangeList(ArrayList<String> list){
        ArrayList<String> res = new ArrayList<>();
        for(String i: list){
            if(i.length() % 2 == 0){
                res.add(i);
                res.add(i);
            }
            else {
                res.add(i);
                res.add(i);
                res.add(i);
            }
        }
        return res;
    }
}