import java.util.Scanner;

public class UnicodeOfCharacter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        int unicode = (int) character;

        System.out.println("The Unicode of '" + character + "' is: " + unicode);





    }
}
