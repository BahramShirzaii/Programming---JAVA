import java.util.Scanner;

public class CostOfDriving {
    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter the driving distance : ");
           double dd = scanner.nextDouble();
           System.out.print("Enter miles per gallon : ");
           double mg = scanner.nextDouble();
           System.out.print("Enter price per gallon : ");
           double p = scanner.nextDouble();

          double gallonsNeeded = dd / mg;

          double cost = gallonsNeeded * p;

        System.out.print("The cost of driving is : " + cost);

    }
}
