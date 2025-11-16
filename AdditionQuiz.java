import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int num1 = (int) ( Math.random() * 99 ) + 1 ;
        int num2 = (int) ( Math.random() * 99 ) + 1 ;
        System.out.println("What is " + num1 + " + " + num2 + " ?");
        int result = num1 + num2;
        int input = scanner.nextInt();
        if ( input == result ) {
            System.out.println("That's correct!");
        }
        else {
            System.out.println("Wrong input!\nThe answer is: " + result );
            }

    }
}
