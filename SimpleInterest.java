import  java.util.Scanner;
public class SimpleInterest {
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

    System.out.print("Give the value for the T (time should be in years) :");

    int T = scanner.nextInt();
    System.out.print("Give the value for the P :");
    double P = scanner.nextDouble();
    System.out.print("Give the value for the R :");
    double R = scanner.nextDouble();

    System.out.print("simple interest is equal to : " + (T * P * R) / 100 );

}
}
