//https://www.codewars.com/kata/52742f58faf5485cae000b9a

import java.util.Arrays;
import java.util.Objects;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        String[] time = new String[5];
        //years
        time[0] = seconds / 31536000 != 0 ? (seconds / 31536000 > 1 ? seconds / 31536000 + " years" : seconds / 31536000 + " year") : null;
        //days
        time[1] = (seconds / 86400)%365 != 0 ? ((seconds / 86400)%365 > 1 ? (seconds / 86400)%365 + " days" : (seconds / 86400)%365 + " day") : null;
        //hours
        time[2] = (seconds / 3600)%24 % 60 != 0 ? ((seconds / 3600)%24 > 1 ? (seconds / 3600)%24 + " hours" : (seconds / 3600)%24 + " hour") : null;
        time[3] = (seconds / 60)%60 > 0 ? ((seconds / 60)%60 > 1 ? (seconds / 60)%60 + " minutes" : (seconds / 60)%60 + " minute") : null;
        time[4] = (seconds%3600)%60 > 0 ? ((seconds%3600)%60 > 1 ? (seconds%3600)%60 + " seconds" : (seconds%3600)%60 + " second") : null;

        time = Arrays.stream(time).filter(Objects::nonNull).toArray(String[]::new);
        if(time.length == 2) return time[0] + " and " + time[1];
        if(time.length == 1) return time[0];
        if(time.length == 0) return "now";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < time.length - 1; ++i){
            sb.append(time[i]);
            if(i != time.length - 2) sb.append(", ");
        }
        return sb.append(" and ").append(time[time.length - 1]).toString();

    }

    public static void main(String[] args) {
        System.out.println(formatDuration(7200));
    }
}