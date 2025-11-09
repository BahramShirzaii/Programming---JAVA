import java.util.Scanner;

public class Acceleration {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial velocity : ");
        double v1 = sc.nextDouble();
        System.out.print("Enter the final velocity : ");
        double v2 = sc.nextDouble();
        System.out.print("Enter the time : ");
        double time  = sc.nextDouble();
        double acceleration = (v2 - v1)/time;
        System.out.printf("The acceleration is %.3f",acceleration);
    }
}
