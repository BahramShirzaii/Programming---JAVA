
import java.util.Scanner;
public class RandomNumberToDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = (int) (Math.random()*7) * 1;
        switch (days){
            case 1:
                System.out.println("Saturday");
                break;
            case 2:
                System.out.println("Sunday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Tuesday");
                break;
            case 5:
                System.out.println("Wednesday");
                break;
            case 6:
                System.out.println("Thursday");
                break;
            case 7:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid day");
        }

    }
}

