import java.util.Scanner;

public class CompoundValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();
        double accountValue  = 0;
        double monthlyInterestRate = 0.05 / 12;
        for (int month = 1; month <= 6; month++) {
            accountValue = (monthlySaving + accountValue) * (1 + monthlyInterestRate);
        }
        System.out.printf("Account value after 6 months: %.3f" , accountValue);





    }

}
