
import java.util.Scanner;
public class SimNum {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number : ");
      String number = scanner.nextLine();

      if (number.length() == 10) {
         switch (number.substring(0, 3)) {
             case "078","073":
                 System.out.println("ETISALAT");

             break;
             case "077","076":
                 System.out.println("MTN");
             break;
             case "079","072":
                 System.out.println("ROSHAN");
                 break;
             case "070","071":
                 System.out.println("AWCC (AFGHAN BSIM");
                 break;
             case "075":
                 System.out.println("AFGHAN TELECOM");
                break;
             case "074":
                 System.out.println("SALLAM");
                break;
                default:
                    System.out.println("Unknown Number!");
                    break;





         }

      } else  {
          System.out.println("Invalid Number!");
      }
    scanner.close();
    }

    }


