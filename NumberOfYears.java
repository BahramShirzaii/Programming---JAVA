import java.util.Scanner;

public class NumberOfYears {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of minutes :");
        long min =  scanner.nextLong();
        long minToHour = min / 60;
//        Hours To Days
        long HourToDay = minToHour / 24;
//        Days To Years
        long DayToYears = HourToDay / 365;
        long RemindDays = HourToDay % 365;
        System.out.println(min +" minutes is approximately "+ DayToYears +" years and "+RemindDays+" days");


    }
}
