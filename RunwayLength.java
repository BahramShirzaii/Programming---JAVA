import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RunwayLength {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of V : ");
    double v = scanner.nextDouble();
    System.out.print("Enter the value of a : ");
    double a = scanner.nextDouble();
    double result = (Math.pow(v, 2) )/(2*a);
    System.out.printf("The minimum runway length for this airplane is %.3f", result);
  }
}
