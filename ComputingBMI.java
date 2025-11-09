import java.util.Scanner;

public class ComputingBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your height in inches: ");
        double height = scanner.nextDouble();
        System.out.print("Please enter your width in pounds: ");
        double width = scanner.nextDouble();
        height = height * 0.0254;
        width = width * 0.45359237;
        double BMI = width / (Math.pow(height,2));
        System.out.printf("Your BMI is %.3f", BMI);

    }
}
