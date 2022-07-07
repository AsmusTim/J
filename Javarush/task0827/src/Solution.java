import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {

    public static boolean isDateOdd(String date) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d yyyy");
        Date date1 = formatter.parse(date);

        int year = date1.getYear();
        int day = date1.getDay();
        if((year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) && day % 2 == 0){
            return false;
        }
        else if(!(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) && day % 2 != 0){
            return false;
        }
        return true;

    }

    public static Map<String, Integer> init(){
        Map<String, Integer> map = new HashMap<>();
        map.put("JANUARY", 1);
        map.put("FEBRUARY", 2);
        map.put("MARCH", 3);
        map.put("APRIL", 4);
        map.put("MAY", 5);
        map.put("JUNE", 6);
        map.put("JULY", 7);
        map.put("AUGUST", 8);
        map.put("SEPTEMBER", 9);
        map.put("OCTOBER", 10);
        map.put("NOVEMBER", 11);
        map.put("DECEMBER", 12);
        return map;
    }

    public static int getNumberOfMonth(String month){
        Map<String, Integer> map = init();
        return map.get(month.toUpperCase());
    }

}
