import java.util.Scanner;

public class SortThreeIntegers {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int first;
        int second;
        int third;

        System.out.print("Please enter the first integer: ");
        first = scanner.nextInt();
        System.out.print("Please enter the secund integer: ");
        second = scanner.nextInt();
        System.out.print("Please enter the third integer: ");
        third = scanner.nextInt();

        if (first > second) {
            int temp = first;
            first = second;
            second = temp;
        }
        if (second > third) {
            int temp = second;
            second = third;
            third = temp;
        }
        if (first > second) {
            int temp = first;
            first = second;
            second = temp;

        }
        System.out.println("Numbers in non-decreasing order: " + first + " " + second + " " + third);

    }
}
