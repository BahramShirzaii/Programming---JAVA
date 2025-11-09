import java.util.IllegalFormatCodePointException;
import java.util.Scanner;
public class ChineseZodiac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your birthday : ");
        int year = scanner.nextInt();
      int zodiac = year % 12;

      switch (zodiac) {
        case 0:
            System.out.println("Your birthday zodiac is Monkey");
            break;
        case 1:
            System.out.println("Your birthday zodiac is Rooster");
            break;
        case 2:
            System.out.println("Your birthday zodiac is Dog");
            break;
        case 3:
            System.out.println("Your birthday zodiac is Pig");
            break;
        case 4:
            System.out.println("Your birthday zodiac is Rat");
            break;
        case 5:
            System.out.println("Your birthday zodiac is Ox");
            break;
        case 6:
            System.out.println("Your birthday zodiac is Tiger");
            break;
        case 7:
            System.out.println("Your birthday zodiac is Rabbit");
            break;
        case 8:
            System.out.println("Your birthday zodiac is Dragon");
            break;
        case 9:
            System.out.println("Your birthday zodiac is Snake");
            break;
        case 10:
            System.out.println("Your birthday zodiac is Horse");
            break;
        case 11:
            System.out.println("Your birthday zodiac is Sheep");
            break;
    }


    }

}
