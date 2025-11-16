import java.util.Scanner;

public class GuessBirthdayYorN {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String set1 = " 1 3 5 7\n9 11 13 15\n17 19 21 23\n25 27 29 31";
        String set2 = " 2 3 6 7\n10 11 14 15\n18 19 22 23\n26 27 30 31";
        String set3 = " 4 5 6 7\n12 13 14 15\n20 21 22 23\n28 29 30 31";
        String set4 = " 8 9 10 11\n12 13 14 15\n24 25 26 27\n28 29 30 31";
        String set5 = "16 17 18 19\n20 21 22 23\n24 25 26 27\n28 29 30 31";

        int day = 0;

        // Set 1
        System.out.println("Is your birthday in Set1?");
        System.out.println(set1);
        System.out.print("Enter Y for Yes and N for No: ");
        char answer = input.next().toUpperCase().charAt(0);
        if (answer == 'Y') day += 1;

        // Set 2
        System.out.println("Is your birthday in Set2?");
        System.out.println(set2);
        System.out.print("Enter Y for Yes and N for No: ");
        answer = input.next().toUpperCase().charAt(0);
        if (answer == 'Y') day += 2;

        // Set 3
        System.out.println("Is your birthday in Set3?");
        System.out.println(set3);
        System.out.print("Enter Y for Yes and N for No: ");
        answer = input.next().toUpperCase().charAt(0);
        if (answer == 'Y') day += 4;

        // Set 4
        System.out.println("Is your birthday in Set4?");
        System.out.println(set4);
        System.out.print("Enter Y for Yes and N for No: ");
        answer = input.next().toUpperCase().charAt(0);
        if (answer == 'Y') day += 8;

        // Set 5
        System.out.println("Is your birthday in Set5?");
        System.out.println(set5);
        System.out.print("Enter Y for Yes and N for No: ");
        answer = input.next().toUpperCase().charAt(0);
        if (answer == 'Y') day += 16;


        System.out.println("Your birthday is " + day + "!");
    }


}
