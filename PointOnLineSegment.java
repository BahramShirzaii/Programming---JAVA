import java.util.Scanner;

public class PointOnLineSegment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        double x0 = scanner.nextDouble();
        double y0 = scanner.nextDouble();
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        double position;
        position=(x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if (position < 0) {
            System.out.println("p2 is on the right side of the line from p0 to p1.");
        }
        else if (position > 1) {
            System.out.println("p2 is on the left side of the line from p0 to p1.");
        }
        else {
            System.out.println("p2 is on the same line from p0 to p1.");
        }

    }
}
