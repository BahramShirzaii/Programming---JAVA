import java.util.Scanner;

public class AreaOfTriangle {
      public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          System.out.print("Enter the value of X1 and Y1 : ");
          double x1 = scanner.nextDouble();
          double y1 = scanner.nextDouble();

          System.out.print("Enter the value of X2 and Y2 : ");
          double x2 = scanner.nextDouble();
          double y2 = scanner.nextDouble();

          System.out.print("Enter the value of X3 and Y3 : ");
          double x3 = scanner.nextDouble();
          double y3 = scanner.nextDouble();

          double dx = x2-x1;
          double dx2 = x3 - x2;
          double dx3 = x3 - x1;
          double dy = y2 - y1;
          double dy2 = y3 - y2;
          double dy3 = y3 - y1;

          double d1 = Math.sqrt(dx*dx+dy*dy);
          double d2 = Math.sqrt(dx2*dx2+dy2*dy2);
          double d3 = Math.sqrt(dx3*dx3+dy3*dy3);

          double side = (d1 + d2 + d3) / 2 ;
          double area = Math.sqrt(side * (side - d1) * (side - d2) * (side - d3));

          System.out.printf("Area of triangle is %.2f", area);


      }
}
