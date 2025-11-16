import java.util.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = Math.abs(scanner.nextInt());

        int d1 = number / 100;
        int d2 = (number / 10) % 10;
        int d3 = number % 10;


        if ( d1 == d3 ) {
            System.out.println("The number is a palindrome.");
        }
        else {
            System.out.println("The number is not a palindrome.");
        }


    }
}
