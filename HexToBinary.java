import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit (0-9, A-F): ");
        String hex = input.next();
        char ch = hex.toUpperCase().charAt(0);

        int number = -1;

        if (ch >= '0' && ch <= '9') {
            number = ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            number = ch - 'A' + 10;
        }

        if (number != -1) {

            String binary = Integer.toBinaryString(number);
            while (binary.length() < 4) {
                binary = "0" + binary;
            }
            System.out.println("The binary value is: " + binary);
        } else {
            System.out.println("Invalid input");
        }
    }
}
