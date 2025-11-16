import java.util.Scanner;

public class TwoCircles {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//        1 :
        System.out.print("Enter the radius of the circle1: ");
        double radius1 = scanner.nextDouble();
        System.out.print("Enter the x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

//        2 :
        System.out.print("Enter the radius of the circle2: ");
        double radius2 = scanner.nextDouble();
        System.out.print("Enter the x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

//        distance :

        double DR = Math.abs(radius2 - radius1);
        double SR = radius1 + radius2;
        double DX = x2 - x1;
        double DY = y2 - y1;
        double D = Math.sqrt(Math.pow(DX, 2) + Math.pow(DY, 2));

//        if statements :
        if (D <= DR) {
            System.out.println("Circle2 is inside Circle1");
        }
        else if (D <= SR){
            System.out.println("Circle2 overlaps Circle1");
        }
        else {
            System.out.println("Circle2 does not overlap Circle1");
        }




    }
}
