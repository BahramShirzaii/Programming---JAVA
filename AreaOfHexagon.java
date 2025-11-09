import java.util.Scanner;

public class AreaOfHexagon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the side : ");
        double s = scanner.nextDouble();
        double result = ( 3 * (Math.sqrt(3)) / 2 ) * (Math.pow(s,2));
        System.out.printf("The area of the hexagon is %.3f", result);


    }
}
