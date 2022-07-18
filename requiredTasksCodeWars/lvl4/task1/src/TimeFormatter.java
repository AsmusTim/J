import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        String[] time = new String[3];
        time[0] = seconds / 3600 != 0 ? (seconds / 3600 > 1 ? seconds / 3600 + " hours" : seconds / 3600 + " hour") : null;
        time[1] = seconds / 60 % 60 > 0 ? (seconds / 60 % 60 > 1 ? seconds / 60 % 60 + " minutes" : seconds / 60 % 60 + " minute") : null;
        time[2] = seconds % 60 > 0 ? (seconds % 60 > 1 ? seconds % 60 + " seconds" : seconds % 60 + " second") : null;
        return Arrays.stream(time).filter(Objects::nonNull).collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        System.out.println(formatDuration(3662));
    }
}