import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        Integer number = scanner.nextInt();

//        آیا عدد بر ۵ و ۶ بخش‌پذیر است؟

        if (number % 5 == 0 &&  number % 6 == 0) {
            System.out.println("Divisible by 5 and 6");
        }

//        آیا عدد بر ۵ یا ۶ بخش‌پذیر است؟
        else if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("Divisible by 5 or 6");
        }
//آیا عدد بر ۵ یا ۶، ولی نه هر دو بخش‌پذیر است؟
        else if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("Divisible by 5 or 6, not divisible by both");
        }
        else {
            System.out.println("Not divisible");
        }

    }
}
