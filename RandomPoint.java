import java.util.Random;

public class RandomPoint {
    public static void main(String[] args) {

        Random random = new Random();

        int x;
        x = (int)  (Math.random() * (50 - (-50) + 1 )) + (-50);

        int y;
        y = (int)  (Math.random() * (100 - (-100) + 1 )) + (-100);

        System.out.println("***** Random Point *****");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
    }
}