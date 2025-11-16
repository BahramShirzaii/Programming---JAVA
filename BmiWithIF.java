import java.util.Scanner;

public class BmiWithIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter feet: ");
        double feet = scanner.nextDouble();

        System.out.print("Enter inches: ");
        double inches = scanner.nextDouble();

        System.out.print("Enter weight in pounds: ");
        double weight = scanner.nextDouble();

        double totalInches = feet * 12 + inches;

        double bmi = (weight * 703) / (totalInches * totalInches);

        String interpretation;
        if (bmi < 18.5)
            interpretation = "Underweight";
        else if (bmi < 25)
            interpretation = "Normal";
        else if (bmi < 30)
            interpretation = "Overweight";
        else
            interpretation = "Obese";

        System.out.printf("BMI is %.1f\n", bmi);
        System.out.println("Interpretation: " + interpretation);
    }
}
