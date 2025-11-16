import java.util.Scanner;

public class PointInCircle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int radius = 10;
        double x1 = 0;
        double y1 = 0;

        System.out.print("Enter the coordinates (x2,y2): ");
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();

         double dx =  x2 - x1;
         double dy = y2 - y1;

         double distance = Math.sqrt(dx * dx + dy * dy);

         if (distance <= radius) {
             System.out.println("("+x1+","+x2+")"+" ("+y1+","+y2+")"+" is in the circle");
         }
         else {
             System.out.println("("+x1+","+x2+")"+" ("+y1+","+y2+")"+" is not in the circle");
         }







    }
}
