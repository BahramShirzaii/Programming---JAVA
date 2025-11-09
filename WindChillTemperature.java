import java.util.Scanner;

public class WindChillTemperature {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
    double temperature = scanner.nextDouble();
    System.out.print("Enter the wind speed ( >= 2) in miles per hour: ");
    double windSpeed = scanner.nextDouble();
     if (temperature < -58 || temperature > 41 || windSpeed < 2){
        System.out.println("Invalid input");
    }
    else {
        temperature = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
         System.out.printf("The wind chill temperature is %.3f" , temperature);
    }
   }
}
