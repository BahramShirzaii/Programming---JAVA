import java.util.Scanner;

public class WindChillTemperature {
public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print(" Enter the temperature in Fahrenheit (-58 to 41) : ");
    int input = scanner.nextInt();
    System.out.print("Enter the wind speed in miles per hour (>= 2): ");
    int input2 = scanner.nextInt();

    if (-58 > input || input > 41){
        System.out.println("Invalid temperature. It must be between -58 and 41°F.");
    }
    else if (input2 < 2) {
        System.out.println("\"Invalid wind speed. It must be at least 2 mph.\"");
    }
    else {

        double windChill = 35.74 + 0.6215 * input
                - 35.75 * Math.pow(input2, 0.16)
                + 0.4275 * input * Math.pow(input2, 0.16);

        System.out.printf("The wind-chill temperature is %.2f°F\n", windChill);


    }

}



}
