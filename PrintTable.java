import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class PrintTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 1, b = 2, c = 3, d = 4, e = 5;
        int m = 2, o = 3, p = 4, q = 5, r = 6;
        System.out.println("A\tB\tMath.pow(A,B)");
        System.out.println("1\t2\t"+(int)Math.pow(a,m));
        System.out.println("2\t3\t"+(int)Math.pow(b,o));
        System.out.println("3\t4\t"+(int)Math.pow(c,p));
        System.out.println("4\t5\t"+(int) Math.pow(d,q));
        System.out.println("5\t6\t"+(int)Math.pow(e,r));
    }
}
