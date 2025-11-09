import java.util.Scanner;
public class PredictingTheFutureTuition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double T= 10000 , R = 0.07 ;
        double traget = T * 2;
        int year = 0;

        while (T < traget){
            T = T * (1+R);
            year++;
        }
        System.out.println("The tuition will double after "+year+" years");
        System.out.printf("Tuition at that time %.2f ", T );

    }

}
