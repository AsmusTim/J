import java.util.*;

public class Solution {
    public static Map<String, String> nameMap;
    public static Map<String, Date> dateMap;
    public static Map<String, Integer> salaryMap;

    //================================================================================
    public static String[] getArrayKeysStrDate(Map<String, Date> map){
        String[] arr = new String[map.size()];
        map.keySet().toArray(arr);
        return arr;
    }
    public static String[] getArrayKeysStrInt(Map<String, Integer> map){
        String[] arr = new String[map.size()];
        map.keySet().toArray(arr);
        return arr;
    }
    public static String[] getArrayKeysStrStrin(Map<String, String> map){
        String[] arr = new String[map.size()];
        map.keySet().toArray(arr);
        return arr;
    }
    //=======================================================================================

    public static int getCountRepeatName(String name, Map<String, String> map){//task0815
        Set<String> surName = map.keySet();
        int count = 0;
        for(String s: surName){
            String st = map.get(s);
            if(st.equals(name)){ count++; }
        }
        return count;
    }

    public static void delBornSummer(Map<String, Date> map){//task0816
        String[] surName = getArrayKeysStrDate(map);
        for(int i = 0; i < surName.length; ++i){
            int month = map.get(surName[i]).getMonth();
            if( 5 <= month && month <= 7){ map.remove(surName[i]); }
        }
    }

    public static void delRepeatName(Map<String, String> map){//task0817
        String[] surName = getArrayKeysStrStrin(map);
        Set<Integer> index = new HashSet<>();

        for(int i = 0; i < surName.length; ++i){
            for(int j = i + 1; j < surName.length; ++j){
                if(map.get(surName[i]).equals(map.get(surName[j]))){ index.add(j); }
            }
        }

        for(int i: index){
            map.remove(surName[i]);
        }
    }
    public static void delIfSalaryLow500(Map<String, Integer> map){//task0818
        String[] surName = getArrayKeysStrInt(map);
        Set<Integer> index = new HashSet<>();

        for(int i = 0; i < surName.length; ++i){
                if(map.get(surName[i]) < 500){ index.add(i); }
        }
        for(int i: index){
            map.remove(surName[i]);
        }
    }
}
