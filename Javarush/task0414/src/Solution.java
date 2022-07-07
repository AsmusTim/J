import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        getDaysInYear(year);
    }

    public static void getDaysInYear(int year){
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.print("количество дней в году: " + 366);
        }
        else{
            System.out.print("количество дней в году: " + 365);
        }
    }
}
