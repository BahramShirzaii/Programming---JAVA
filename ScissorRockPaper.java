import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Rock, Paper, Scissor : ");
            String input = scanner.nextLine();

        int random = (int) (Math.random()*3);

        if (random == 0) {
            System.out.println("Rock");
        }
        else if (random == 1) {
            System.out.println("Paper");
        }
        else if (random == 2) {
            System.out.println("Scissor");
        }


        if (random == 0 && input.equalsIgnoreCase("Rock")){
            System.out.println("TIE!");}

        else if (random == 0 && input.equalsIgnoreCase("Paper")){
            System.out.println("YOU LOST!");}

        else if (random == 0 && input.equalsIgnoreCase("Scissor")){
            System.out.println("You WON!");
        }


         if (random == 1 && input.equalsIgnoreCase("Rock")){
             System.out.println("YOU WON!");}

        else if (random == 1 && input.equalsIgnoreCase("Paper")){
            System.out.println("TIE!");}

        else if (random == 1 && input.equalsIgnoreCase("Scissor")){
            System.out.println("YOU LOST!");}



        else if (random == 2 && input.equalsIgnoreCase("Rock")){
            System.out.println("YOU LOST!");}

        else if (random == 2 && input.equalsIgnoreCase("Paper")){
            System.out.println("YOU WON!");}

        else if (random == 2 && input.equalsIgnoreCase("Scissor")){
            System.out.println("TIE!");}


        else {
            System.out.println("unknown input!");
         }
    }
}