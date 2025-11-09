import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the investment amount : ");
        double investmentAmount = scanner.nextDouble();
        System.out.print("Please enter the annual interest rate : ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Please enter the number of years : ");
        int numberOfYears = scanner.nextInt();

        double monthlyInterestRate;
        monthlyInterestRate = annualInterestRate / 1200;

        double futureInvestmentValue;
       futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);

        System.out.printf("The future investment value is $%.2f", futureInvestmentValue);
    }
}
