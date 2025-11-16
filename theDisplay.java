import java.util.Scanner;
import java.util.Random;
public class theDisplay {
    public static void main(String[] args) {







                      // بِسْمِ الله الرَّحْمَٰنِ الرَّحِيْم
       // In the name of Allah, The Most Gracious and The Most Merciful.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


    int num1 = random.nextInt(0,11);
    int num2 =  random.nextInt(0,11);
    int sum = num1 + num2;
    int answer ;
    int count =0;
while(true && count<10){

    System.out.print(num1+"+"+num2+"=");
    answer = scanner.nextInt();
    if (answer == sum){
        System.out.println("Excellent");
    }
    else{
        System.out.println("Wrong!");
    }
    count++;
    break;
}
























    }
}

