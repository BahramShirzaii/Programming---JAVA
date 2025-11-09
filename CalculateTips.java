import java.util.*;
public class CalculateTips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the subtotal : ");
        double subtotal = scanner.nextDouble();
        System.out.println("Enter the gratuity rate : ");
        double tips = scanner.nextDouble();
        double gratuity = tips / 100;
        double gratuityRate = subtotal * gratuity;
        System.out.println("The gratuity rate is: " + gratuityRate);
        double total = subtotal + gratuityRate;
        System.out.println("The total is: " + total);
    }
}