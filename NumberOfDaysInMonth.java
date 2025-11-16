import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the month number  : ");
        int month = scanner.nextInt();
        System.out.print("Please enter the year number : ");
        int year =  scanner.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("This month has 31 Days.");
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("This month has 30 Days.");
        }
        else if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || ( year % 400 == 0 )) {
                System.out.println("February "+ year + " has 29 Days.");
            }
            else {
                System.out.println("February "+ year + " 28 Days.");
            }
        }
    }
}
