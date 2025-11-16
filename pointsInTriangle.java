import java.util.Scanner;

public class pointsInTriangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the value of x4: ");
        double x = scanner.nextDouble();
        System.out.print("Enter the value of y4: ");
        double y = scanner.nextDouble();

        if (x >= 0 && x <= 200 && y >= 0 && y <= 100 && y <= - 0.5 * x + 100 ){
            System.out.println("Points in triangle");
        }
        else {
            System.out.println("Points not in triangle");
        }



    }
}
