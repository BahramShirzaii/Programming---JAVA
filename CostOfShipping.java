import java.util.Scanner;

public class CostOfShipping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the weight of the package : ");
        int weight = scanner.nextInt();

        if ( 0 < weight && weight <= 1 ) {
            System.out.println("Shipping cost is $3.5");
        }
        else if ( 1 < weight && weight <= 3 ) {
            System.out.println("Shipping cost is $5.5");
        }
       else if ( 3 < weight && weight <= 10 )
        {
            System.out.println("Shipping cost is $8.5");
        }
       if (10 < weight && weight <= 20 ) {
           System.out.println("Shipping cost is $10.5");
       }
       else if (weight > 20) {
           System.out.println("This package cannot be shipped");
       }
       else {
           System.out.println("invalid input");
       }
    }
}
