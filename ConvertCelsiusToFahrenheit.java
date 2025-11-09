import java.util.Scanner;
public class ConvertCelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature Celsius : ");
        double celsius = scanner.nextDouble();
        double Fahrenheit = (((double) 9/5) * celsius) + 32;
        System.out.println("The value of Celsius in Fahrenheit is " + Fahrenheit);

    }

}
