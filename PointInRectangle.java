import java.util.Scanner;

public class PointInRectangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = 0;
        double x2;
        double y1 = 0;
        double y2;
        double width = 10;
        double height = 5;

        System.out.print("Enter the x2: ");
        x2 = scanner.nextDouble();
        System.out.print("Enter the y2: ");
        y2 = scanner.nextDouble();

        if (x2 <= width / 2 && y2 <= height / 2) {
            System.out.println("Point "+ "(" + x2 + ", " + y2 + ")" + " is in the rectangle");
        }
        else {
            System.out.println("Point "+ "(" + x2 + ", " + y2 + ")" + " is not in the rectangle");
        }

    }
}
