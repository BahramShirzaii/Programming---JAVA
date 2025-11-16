import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from USD to RMB: ");
        double rate = input.nextDouble();

        System.out.print("Enter 0 to convert USD to RMB, 1 to convert RMB to USD: ");
        int choice = input.nextInt();

        System.out.print("Enter the amount to convert: ");
        double amount = input.nextDouble();

        double result;
        if (choice == 0) {
            result = amount * rate;
            System.out.println(amount + " USD is " + result + " RMB");
        } else if (choice == 1) {
            result = amount / rate;
            System.out.println(amount + " RMB is " + result + " USD");
        } else {
            System.out.println("Invalid choice. Please enter 0 or 1.");
        }
    }
}