import java.util.Scanner;

public class AreaOfPentagon {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex (Radius): ");
        double radius = sc.nextDouble();

        double s;
        s = 2 * radius * (Math.sin(Math.PI / 5));

        double area;
        area =( 5 * s * s )/ (4 * Math.tan(Math.PI / 5) );
        System.out.printf("The area of the pentagon is %.2f", area);

    }
}
