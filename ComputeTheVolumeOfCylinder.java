import java.util.Scanner;

public class ComputeTheVolumeOfCylinder {
public  static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    double PI=3.14;
    double length;

    System.out.print("Enter the radius : ");
    double radius=scanner.nextDouble();
    System.out.print("Enter the length : ");
    length=scanner.nextDouble();
    double area = radius * radius * PI;
    System.out.println("The area is "+area);
    System.out.println("The volume is "+area*length);

}
}
