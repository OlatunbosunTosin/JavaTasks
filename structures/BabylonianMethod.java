import java.util.Scanner;

public class BabylonianMethod{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        long number = input.nextLong();

        double squareRoot = sqrt(number);
        System.out.printf("Babylonian method squareroot = %.2f%n",squareRoot);

        System.out.printf("Math class squareroot = %.2f", Math.sqrt(number));
    }

    public static double sqrt(long number){
       
        long lastGuess = 1;
        long nextGuess = (lastGuess + (number / lastGuess)) / 2;
        while(Math.abs(nextGuess - lastGuess) >= 0.0001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (number / lastGuess)) / 2;

        }

        return nextGuess;
    }

}
