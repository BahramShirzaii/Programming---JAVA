import java.util.Scanner;


public class ConvertCelsuisToFahrenheit
{
    public static void main(String[] args)
    {

Scanner scanner = new Scanner(System.in);

double celsius;
        System.out.print("Enter the Celsius :");
    celsius = scanner.nextDouble();
double Fahrenheit = (9/5)*celsius + 32;
        System.out.println("The Fahrenheit is "+Fahrenheit);
    }
}
