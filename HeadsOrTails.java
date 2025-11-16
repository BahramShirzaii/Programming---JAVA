import java.util.Scanner;
import java.util.Random;
public class HeadsOrTails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter 0 for Heads and 1 for Tails : ");
        int input = scanner.nextInt();

        int rand = random.nextInt(0,2);
        if (rand == 0) {
            System.out.println("Heads");
        }
        if (rand == 1) {
            System.out.println("Tails");
        }

        if (rand == input) {
            System.out.println("You won!");
        }
        else {
            System.out.println("You lost!");
        }
    }
}