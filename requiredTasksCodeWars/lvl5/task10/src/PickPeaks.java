//https://www.codewars.com/kata/5279f6fe5ab7f447890006a7

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PickPeaks {


    /*not complete*/

    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        ArrayList<Integer> peak = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();

        boolean growth = false;
        int max = 0;
        for(int i = 1; i < arr.length; ++i){
            if(arr[i - 1] < arr[i]){
                growth = true;
                max = i;
            }
            if(growth && arr[i - 1] > arr[i]){
                peak.add(arr[max]);
                pos.add(max);
                growth = false;
            }
        }


        HashMap<String, List<Integer>> map = new HashMap<>();
        map.put("peaks", peak);
        map.put("pos", pos);
        return map;
    }

    public static void main(String[] args) {
        System.out.println(getPeaks(new int[]{3,2,3,6,4,1,2,3,2,1,2,3}));
    }
}