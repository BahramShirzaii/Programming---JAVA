import javax.swing.*;
import java.util.Scanner;
public class SolveQuadraticEquations {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
//        Delta
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
           double r1;
           double r2;
           r1 = (-b + Math.sqrt(delta)) / (2 * a);
           r2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Quadratic Equation: " + r1 + "," + r2);

        }
        else if (delta == 0) {
            double r = - b / (2 * a);
            System.out.println("Quadratic Equation: " + r);
        }
        else {
            System.out.println("Quadratic Equation Error");
        }

        }
}
