import java.util.Scanner;

public class BabylonianMethodForTest{

    public static void main(String[] args){

        sqrt(16);

    }

    public static double sqrt(long number){
       
        long lastGuess = 1;
        long nextGuess = (lastGuess + (number / lastGuess)) / 2;
        while(Math.abs(nextGuess - lastGuess) > 0.001){
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (number / lastGuess)) / 2;

        }

        return nextGuess;
    }

}
