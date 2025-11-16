import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year : ");
        int year = scanner.nextInt();
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();


        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }

        int k = year % 100;
        int j = year / 100;


        int h = (day + (26 * (month + 1)) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;

        if (h == 0 ) {
            System.out.println("Saturday");
        }
        else if (h == 1  ) {
            System.out.println("Sunday");
        }
        else if (h == 2 ) {
            System.out.println("Monday");
        }
        else if (h == 3 ) {
            System.out.println("Tuesday");
        }
        else if (h == 4 ) {
            System.out.println("Wednesday");
        }
        else if (h == 5 ) {
            System.out.println("Thursday");
        }
        else if (h == 6 ) {
            System.out.println("Friday");
        }
        else {
            System.out.println("Unknown");
        }

         }


}