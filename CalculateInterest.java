import java.util.Scanner;

public class CalculateInterest {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the balance : ");
        double balance = scanner.nextDouble();
        System.out.print("Please enter the annual interest rate : ");
        double annualInterestRate = scanner.nextDouble();

        annualInterestRate = annualInterestRate / 1200;

        double result = balance * annualInterestRate;
        System.out.printf("The interest rate is %.2f", result);


    }
}
