//https://www.codewars.com/kata/52685f7382004e774f0001f7

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        int h = seconds / 3600;
        int m = (seconds / 60) % 60;
        int s = seconds - (seconds / 3600) * 3600 - ((seconds / 60) % 60) * 60;
        return String.format("%s:%s:%s", h / 10 == 0 ? "0" + h : "" + h, m / 10 == 0 ? "0" + m : "" + m, s / 10 == 0 ? "0" + s : "" + s);

    }

    public static void main(String[] args) {
        System.out.println(makeReadable(359999));
    }
}