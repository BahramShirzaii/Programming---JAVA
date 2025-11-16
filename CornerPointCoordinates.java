import java.util.Scanner;

public class CornerPointCoordinates {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();


        double angle = 2 * Math.PI / 5;

        System.out.println("Coordinates of the five corner points:");
        for (int i = 0; i < 5; i++) {
            double theta = i * angle;
            double x = r * Math.cos(theta);
            double y = r * Math.sin(theta);
            System.out.printf("p%d: (%.2f, %.2f)\n", i+1, x, y);
        }


    }
}
