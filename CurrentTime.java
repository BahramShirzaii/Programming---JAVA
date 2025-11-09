public class CurrentTime {
    public static void main(String[] args) {

        long totalTimeinMilli = System.currentTimeMillis();
        long totalSeconds = totalTimeinMilli / 1000;
        long currentSeconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 24;
        System.out.println(currentHours+":"+currentMinutes+":"+currentSeconds);
    }
}
