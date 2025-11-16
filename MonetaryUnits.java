import java.util.Scanner;

public class MonetaryUnits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your amount: ");
        double amount = scanner.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int dollars = remainingAmount / 100;
        remainingAmount %= 100;

        int quarters = remainingAmount / 25;
        remainingAmount %= 25;

        int dimes = remainingAmount / 10;
        remainingAmount %= 10;

        int nickels = remainingAmount / 5;
        remainingAmount %= 5;

        int pennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of:");

        if (dollars > 0)
            System.out.println(dollars + (dollars == 1 ? " dollar" : " dollars"));
        if (quarters > 0)
            System.out.println(quarters + (quarters == 1 ? " quarter" : " quarters"));
        if (dimes > 0)
            System.out.println(dimes + (dimes == 1 ? " dime" : " dimes"));
        if (nickels > 0)
            System.out.println(nickels + (nickels == 1 ? " nickel" : " nickels"));
        if (pennies > 0)
            System.out.println(pennies + (pennies == 1 ? " penny" : " pennies"));
    }
}
