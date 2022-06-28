import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(), date = sc.nextLine();
        printDataBorn(name, date);
    }
    public static void printDataBorn(String name, String strDate) throws ParseException {
        System.out.printf("Меня зовут %s\n", name);
        SimpleDateFormat formatter = new SimpleDateFormat("d.M.yyyy", Locale.ENGLISH);
        Date date = formatter.parse(strDate);
        System.out.print("Я родился " + formatter.format(date));

    }
}
