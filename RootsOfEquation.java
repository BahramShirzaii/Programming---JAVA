    import java.util.Scanner;
    public class RootsOfEquation {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.print("Entar the value of 'a' : ");
        double a = input.nextInt();
        System.out.print("Entar the value of 'b' : ");
        double b = input.nextInt();
        System.out.print("Entar the value of 'c' : ");
        double c = input.nextInt();
        double Delta = Math.pow(b,2)-(4*a*c);
        if (Delta > 0) {
            double R1 = (-b + Math.sqrt(Delta) / (2 * a));
            double R2 = (-b - Math.sqrt(Delta) / (2 * a));
            System.out.println("R1: " + R1 + "\nR2: " + R2);
        }
        else if (Delta == 0) {
            double R = (-b + Math.pow(Delta, 0.5) / (2 * a));
            System.out.println("R: " + R);
        }
        else {
            System.out.println("The Equation has no REAL roots!");
        }



    }
}
