import java.util.Scanner;

public class Pick_A_Card {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int random = (int) (Math.random()*13)+1;

        String rank = "";
        if (random == 1){
        rank = "Ace";
        }
        else if (random == 11){
            rank = "Jack";
        }
        else if (random == 12){
            rank = "Queen";
        }
        else if (random == 13){
            rank = "King";
        } else {
            System.out.println(String.valueOf(random));
        }

        int random2 =  (int) (Math.random()*4);
        String suit = "";
        if (random2 == 0){
            suit = "Clubs";
        }
        else if (random2 == 1){
            suit = "Hearts";
        }
        else if (random2 == 2){
            suit = "Diamonds";
        }
        else if (random2 == 3){
            suit = "Spades";
        }
        System.out.println("The card you picked is "+ rank +" of "+ suit);
    }
}
