import java.util.Scanner;

public class RandomPointsOnCircle {
    public static void main(String[] args) {
        double r = 40;

        double a1 = Math.random() * 2 * Math.PI;
        double a2 = Math.random() * 2 * Math.PI;
        double a3 = Math.random() * 2 * Math.PI;

        double x1 = r * Math.cos(a1);
        double y1 = r * Math.sin(a1);

        double x2 = r * Math.cos(a2);
        double y2 = r * Math.sin(a2);

        double x3 = r * Math.cos(a3);
        double y3 = r * Math.sin(a3);

        double a = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2)); // ضلع روبروی نقطه 1
        double b = Math.sqrt(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2)); // ضلع روبروی نقطه 2
        double c = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); // ضلع روبروی نقطه 3

        double angle1 = Math.acos((b*b + c*c - a*a) / (2*b*c));
        double angle2 = Math.acos((a*a + c*c - b*b) / (2*a*c));
        double angle3 = Math.acos((a*a + b*b - c*c) / (2*a*b));

        angle1 = Math.toDegrees(angle1);
        angle2 = Math.toDegrees(angle2);
        angle3 = Math.toDegrees(angle3);


        System.out.printf("Angles of the triangle: %.2f, %.2f, %.2f degrees\n", angle1, angle2, angle3);
    }
}
