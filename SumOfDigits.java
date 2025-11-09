import java.util.Scanner;
public class SumOfDigits{
    public static void main (String[] args){
Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
   int num = scanner.nextInt();
    int sum = 0;

    if (num < 0){
      num = - num;
        }
while (num > 0){

    int x = num % 10;
    sum = sum + x;
    num = num / 10;

}
        System.out.println("The sum is " + sum);


    }


    }

