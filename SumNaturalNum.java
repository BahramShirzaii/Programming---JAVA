import java.util.Scanner;

public class SumNaturalNum {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
int n ;
        System.out.print("Enter a Natural number :");
        n = scanner.nextInt();
        System.out.println("The sum is "+n*(n+1)/2);

    }

}
