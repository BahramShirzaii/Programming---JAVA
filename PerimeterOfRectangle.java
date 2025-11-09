import java.awt.*;
import java.util.Scanner;
public class PerimeterOfRectangle {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    double length;
double width;

    System.out.print("Enter the length :");
length = scanner.nextDouble();
    System.out.print("Enter the width :");
width = scanner.nextDouble();
    System.out.println("the perimeter is " + 2*(length + width));
}

}
