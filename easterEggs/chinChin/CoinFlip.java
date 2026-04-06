import java.util.Random;
import java.util.Scanner;
public class CoinFlip{
    public static void main(String[] args){
        Random generator = new Random();
        int headTail = generator.nextInt(2);
        Scanner input = new Scanner(System.in); 
        System.out.printf("What is your guess: head(0) or tail(1)? ");
        int guess = input.nextInt();
        System.out.printf("%d%n", headTail);
        if (headTail == guess){
            System.out.printf("Your guess is correct%n");
        }
        else{
            System.out.printf("Your guess is wrong!!! Try again%n");
        }
    }
}
