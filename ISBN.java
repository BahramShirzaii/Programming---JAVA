import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first;
        int second;
        int third;
        int fourth;
        int fifth;
        int sixth;
        int seventh;
        int eighth;
        int ninth;
        int tenth;

        System.out.print("Enter the first integer (d1) : ");
        first = scanner.nextInt();
        System.out.print("Enter the second integer (d2) : ");
        second = scanner.nextInt();
        System.out.print("Enter the third integer (d3) : ");
        third = scanner.nextInt();
        System.out.print("Enter the fourth integer (d4) : ");
        fourth = scanner.nextInt();
        System.out.print("Enter the fifth integer (d5) : ");
        fifth = scanner.nextInt();
        System.out.print("Enter the sixth integer (d6) : ");
        sixth = scanner.nextInt();
        System.out.print("Enter the seventh integer (d7) : ");
        seventh = scanner.nextInt();
        System.out.print("Enter the eighth integer (d8) : ");
        eighth = scanner.nextInt();
        System.out.print("Enter the ninth integer (d9) : ");
        ninth = scanner.nextInt();


//        (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
//                d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11

     tenth = (first * 1 + second * 2 + third * 3 +  fourth * 4 + fifth * 5 + sixth * 6 + seventh * 7 + eighth * 8 + ninth * 9) % 11;

     String d10 = (tenth == 10) ? "x" : String.valueOf(tenth);

        System.out.println("The ISBN number is " + first + second + third + fourth + fifth + sixth + seventh + eighth + ninth + d10);
    }
}
