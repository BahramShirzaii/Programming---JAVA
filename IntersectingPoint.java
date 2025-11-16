import java.util.Scanner;

public class IntersectingPoint {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();

        double a1 = y1 - y2;
        double b1 = -(x1 - x2);
        double c1 = a1 * x1 + b1 * y1;

        double a2 = y3 - y4;
        double b2 = -(x3 - x4);
        double c2 = a2 * x3 + b2 * y3;

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            System.out.println("The two lines are parallel");
        } else {
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            System.out.println("The intersecting point is at "+ "("+x+","+" "+y +")");
        }

    }
}
