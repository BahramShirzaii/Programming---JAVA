import java.util.Scanner;

public class SimCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your phone number :");
        String c = scanner.nextLine();
        if (c.length() == 10) {
            switch (c.substring(0, 3)) {
                case "078":
                    System.out.println("Your phone number is from Etisalat service!");
                    break;
                case "077":
                    System.out.println("Your phone number is from Mtn service!");
                    break;
                case "072":
                    System.out.println("Your phone number is from Roshan service!");
                    break;
                case "071":
                    System.out.println("Your phone number is from AWCC service!");
                    break;
                case "074":
                    System.out.println("Your phone number is from Sallam service!");
                    break;
                default:
                    System.out.println("Unknown phone number!");
            }


        }
        else {
            System.out.println("Invalid phone number!");
        }

    }
}



