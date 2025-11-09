import java.util.Scanner;

public class DistanceOF2Points {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter X1, Y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Please enter X2, Y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double dx = x2 - x1;
        double dy = y2 - y1;
        double distance = Math.sqrt(dx * dx + dy * dy);
        System.out.printf("The distance between points is %.3f" , distance);
    }
}
