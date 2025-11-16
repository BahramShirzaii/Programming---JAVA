import java.util.Random;
import java.util.Scanner;

public class lottery2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter a three digit integer : ");
        int digit = scanner.nextInt();
        int num = random.nextInt(100,1000);

        int d1 = digit / 100;
        int D1 = num / 100;

        int d2 = (digit / 10) % 10;
        int D2 = (num / 10) % 10;

        int d3 = digit % 10;
        int D3 = num % 10;

        if (digit == num) {
            System.out.println("You won $10,000");
        }
        else if (d1 == D1 || d1 == D2 || d1 == D3 && d2 == D2 || d2 == D3  && d3 == D3) {
            System.out.println("You won $3,000");
        }
        else if (d1 == D1 || d1 == D2 || d1 == D3 || d2 == D2 || d2 == D3  || d3 == D3){
            System.out.println("You won $1,000");
        }
        else {
            System.out.println("You won $0");
        }
    }
}
