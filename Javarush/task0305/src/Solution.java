import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Solution {
    public static void main(String[] str){
        printDateBorn();
    }

    public static void printDateBorn(){
        Calendar calendar = new GregorianCalendar(2001, 6 , 17);
        DateFormat df = new SimpleDateFormat("MMM d yyyy");
        System.out.print(df.format(calendar.getTime()));
    }
}
