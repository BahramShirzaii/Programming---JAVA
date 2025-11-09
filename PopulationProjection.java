import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of years: ");
        int years = input.nextInt();

        long population = 312032486;
        double growthRate = 0.01; //

        for (int i = 1; i <= years; i++) {
            population = (long)(population * (1 + growthRate));
        }

        System.out.println("Population after " + years + " years is " + population);
    }
}
