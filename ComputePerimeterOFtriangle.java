import java.util.Scanner;

public class ComputePerimeterOFtriangle {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the 'a' value of the triangle : ");
        double a = scanner.nextDouble();
        System.out.print("Enter the 'b' value of the triangle : ");
        double b = scanner.nextDouble();
        System.out.print("Enter the 'c' value of the triangle : ");
        double c = scanner.nextDouble();

        if ( a + b > c && b + c > a && a + c > b) {
            double perimater = (a + b + c);
            System.out.println("The perimeter of the triangle is " + perimater);
        }
        else {
            System.out.println("Invalid input");
        }


    }
}
