import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static String changeDate(String date) throws ParseException {
        SimpleDateFormat dateIn = new SimpleDateFormat("MM/d/yyyy", Locale.ENGLISH);
        Date date1 = dateIn.parse(date);

        SimpleDateFormat dateOut = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);
        return dateOut.format(date1);
    }

    public static void main(String[] args) throws ParseException {
        System.out.print(changeDate("08/18/2013"));
    }
}
