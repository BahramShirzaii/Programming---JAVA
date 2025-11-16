import java.util.Scanner;

public class TwoRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        1 :
        System.out.print("Enter the x1 and y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        double halfWidth = width / 2;
        double halfHeight = height / 2;

        double left = x1 - halfWidth;
        double right = x1 + halfWidth;
        double top = y1 + halfHeight;
        double bottom = y1 - halfHeight;

//    2 :
        System.out.print("Enter the x2 and y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double  height2 = scanner.nextDouble();
        System.out.print("Enter the width: ");
        double  width2 = scanner.nextDouble();
        double halfWidth2 = width2 / 2;
        double halfHeight2 = height2 / 2;

        double left2 = x2 - halfWidth2;
        double right2 = x2 + halfWidth2;
        double top2 = y2 + halfHeight2;
        double bottom2 = y2 - halfHeight2;


// if statements
        if (left2 >= left && right2 <= right && top2 <= top && bottom2 >= bottom) {
            System.out.println("Rectangle2 is inside Rectangle1");
        }
        else if (left2 < right && right2 > left && top2 > bottom && bottom2 < top){
            System.out.println("Rectangles overlap");
        }
        else {
            System.out.println("Rectangles do not overlap");
        }

    }
}
