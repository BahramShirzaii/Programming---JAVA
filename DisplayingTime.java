import java.util.Scanner;

public class DisplayingTime {
    public static void main(String[] args) {
        long currentTimeInMilli = System.currentTimeMillis();

        long totalSeconds = currentTimeInMilli / 1000;
        long seconds = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long hours = totalHours % 24;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
