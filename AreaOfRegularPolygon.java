import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfRegularPolygon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = scanner.nextInt();
        System.out.print("Enter the side: ");
        double side = scanner.nextDouble();

        double area = (n * side * side) / (4 * Math.tan(Math.PI / n));

        System.out.printf("The area of the polygon is %.2f", area);



    }
}
