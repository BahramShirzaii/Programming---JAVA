import java.util.Scanner;
public class ConvertPoundsIntoKilograms {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double pounds;
    System.out.print("Please enter the pounds you would like to convert:");
    pounds = scanner.nextDouble();
    double kilograms;
    kilograms = pounds * 0.45359237;
    System.out.println("pounds converted to " + kilograms + " kilograms");
    }

}
