import java.util.*;

public class SumTheDigits {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number between 0 and 1000 : ");
            int num =  scanner.nextInt();
            int sum = 0;
            while(num > 0) {
                int digit = num % 10;
                num = num / 10 ;
                sum = sum + digit;

            }
        System.out.println("The sum is: " + sum);
    }
}
