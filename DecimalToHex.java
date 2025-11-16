        import java.util.Scanner;

        public class DecimalToHex {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter an integer between 0 and 15: ");
            int number = input.nextInt();

            if (number >= 0 && number <= 15) {
                if (number < 10) {
                    System.out.println("The hex value is: " + number);
                } else {
                    char hexChar = (char) ('A' + (number - 10));
                    System.out.println("The hex value is: " + hexChar);
                }
            } else {
                System.out.println("Invalid input");
            }
        }
    }


