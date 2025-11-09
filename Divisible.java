import java.util.Scanner;

public class Divisible {


    public static void main(String[] args) {

Scanner scanner =new Scanner(System.in);

        System.out.print("Enter a number to be divisible by : ");
int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("This number can be divisible by 2 !");
        }
        if (num % 3 == 0 && num % 15 == 0){
            System.out.println("This number can be divisible by 3 !");
        }
        if (num % 4 == 0){
            System.out.println("This number can be divisible by 4 !");
        }
        if (num % 5 == 0){
            System.out.println("This number can be divisible by 5 !");
        }
        if (num % 6 == 0){
            System.out.println("This number can be divisible by 6 !");
        }
        if (num % 7 == 0){
            System.out.println("This number can be divisible by 7 !");
        }
        if (num % 8 == 0){
            System.out.println("This number can be divisible by 8 !");
        }
        if (num % 9 == 0){
            System.out.println("This number can be divisible by 9 !");
        }
        if (num % 10 == 0){
            System.out.println("This number can be divisible by 10 !");
        }
    }
}
