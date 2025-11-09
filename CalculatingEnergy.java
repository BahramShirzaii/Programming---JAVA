import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double water = scanner.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemperature = scanner.nextDouble();
        double energy = water * (finalTemperature - temperature) * 4184 ;

        System.out.println("The energy needed is "+energy);




    }
}
