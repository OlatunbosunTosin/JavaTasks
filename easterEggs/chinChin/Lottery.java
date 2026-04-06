import java.util.Random;
import java.util.Scanner;
public class Lottery{
    public static void main(String[] args){
        Random generator = new Random();
        int randomNumber = generator.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a two digit number: ");
        int userNumber = input.nextInt();
        int leftRandomNumber = randomNumber / 10;
        int rightRandomNumber = randomNumber % 10;
        int leftUserNumber = userNumber / 10;
        int rightUserNumber = userNumber % 10;
           

        if (randomNumber == userNumber){
            System.out.printf("Lottery number is %02d and your number is %02d, You won $10000%n", randomNumber, userNumber);
        }
        else if (leftRandomNumber == rightUserNumber && rightRandomNumber == leftUserNumber){
            System.out.printf("Lottery number is %02d and your number is %02d, You won $3000%n", randomNumber, userNumber);
        }
        else if (leftRandomNumber == rightUserNumber || rightRandomNumber == leftUserNumber || leftRandomNumber == leftUserNumber || rightRandomNumber == rightUserNumber){
            System.out.printf("Lottery number is %02d and your number is %02d, You won $1000%n", randomNumber, userNumber);
        }
        else{
            System.out.printf("Lottery number is %02d and your number is %02d%nNothing for you!!! ", randomNumber, userNumber);
        }
    }
}
