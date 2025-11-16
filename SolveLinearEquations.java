import java.util.Scanner;

public class SolveLinearEquations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        System.out.print("Enter d: ");
        double d = scanner.nextDouble();
        System.out.print("Enter e: ");
        double e = scanner.nextDouble();
        System.out.print("Enter f: ");
        double f = scanner.nextDouble();

        double denominator = a*d - b*c;

        if (denominator == 0) {
            System.out.println("The equation has no solution.");
        } else {
            double x = (e*d - b*f) / denominator;
            double y = (a*f - e*c) / denominator;
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}