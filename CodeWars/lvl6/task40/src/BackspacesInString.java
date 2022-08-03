//https://www.codewars.com/kata/5727bb0fe81185ae62000ae3

import java.util.ArrayList;
import java.util.stream.Collectors;

public class BackspacesInString {
    public String cleanString(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(char c: s.toCharArray()){ list.add(c); }

        int it = 0;
        while(it < list.size()){
            if(list.get(it) == '#'){
                if(it == 0){
                    list.remove(it);
                }
                else{
                    list.remove(it--);
                    list.remove(it);
                }
            }
            else{ it++; }
        }
        return list.stream().map(String::valueOf).collect(Collectors.joining());
    }


    public static void main(String[] args) {
        System.out.println(new BackspacesInString().cleanString(""));
    }
}