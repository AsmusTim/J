import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class PickPeaks {


    /*not complete*/

    public static Map<String,List<Integer>> getPeaks(int[] arr) {
        ArrayList<Integer> peak = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        //int dis = 4;
        for(int i = 2; i < arr.length - 2; ++i ){
            if(/*dis > 2 &&*/ arr[i - 1] < arr[i] && arr[i] >= arr[i + 1]){
                peak.add(arr[i]);
                pos.add(i);
                //dis = 0;
            }
            //dis++;
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