import java.util.Scanner;

public class AddThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = (int)  (Math.random() * 10);
        int b = (int)  (Math.random() * 10);
        int c = (int)  (Math.random() * 10);
        System.out.println("What is "+ a + " + "+ b +" + "+ c + " = ?");
        int answer = scanner.nextInt();
        int AnswerSystem = a + b + c;
        if (answer == AnswerSystem) {
            System.out.print("correct!");

            }
        else {
            System.out.print("incorrect!");
        }

        }
    }
