import java.util.Scanner;
public class ComparingNumbers {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int num1 = scanner.nextInt();

    System.out.print("Enter the second number : ");
    int num2 = scanner.nextInt();

    if ( num1 > num2){
        System.out.println("The Largest number is : "+ num1);
        System.out.println("The lowest number is : "+ num2);
    }
    else {

        System.out.println("The largest number is : "+ num2);
        System.out.println("The lowest number is : "+ num1);
    }
}
}
