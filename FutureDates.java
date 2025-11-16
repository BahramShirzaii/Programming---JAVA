import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class FutureDates {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter today’s day: ");
        int day = scanner.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int futureDay = scanner.nextInt();
        int guess = futureDay % 7;
        guess += day;
        switch(guess){
            case 0: System.out.println("Sunday"); break;
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            default: System.out.println("Invalid guess"); break;
        }





    }
}
