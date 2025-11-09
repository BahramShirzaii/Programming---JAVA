import java.util.Scanner;
public class ConvertFeetToMeters {
public static  void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);
    double feet;
    System.out.print("Please enter the value of Feet : ");
    feet = scanner.nextDouble();

    double meters = feet*0.305;
    System.out.println("The value of Feet in Meters is "+meters);

 }
}
