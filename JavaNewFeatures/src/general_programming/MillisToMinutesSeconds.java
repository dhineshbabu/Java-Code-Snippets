package general_programming;

import java.util.concurrent.TimeUnit;

public class MillisToMinutesSeconds {
    public static void main(String[] args) {
        long milliseconds = 10000000;

        long minutes = TimeUnit.MILLISECONDS.toMinutes(milliseconds);
        System.out.println(minutes);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(milliseconds);
        System.out.println(seconds);
    }
}
