import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double lat1 = scanner.nextDouble();
        double lon1 = scanner.nextDouble();

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double lat2 = scanner.nextDouble();
        double lon2 = scanner.nextDouble();

        lat1 = Math.toRadians(lat1);
        lon1 =  Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 =  Math.toRadians(lon2);
        double dy = lon1 - lon2;

        double radius = 6371.01;

        double d;
        d = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(dy) );

        System.out.printf("The distance between the two points is %.2f", d );
        //        d = radius * arccos(sin (x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

    }
}