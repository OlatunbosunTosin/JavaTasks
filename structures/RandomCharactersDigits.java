import java.util.Scanner;
import java.util.Random;

public class RandomCharactersDigits{

    public static void main(String[] args){

        generateRandomCharacters();

    }

    public static void generateRandomCharacters(){

        Random generator = new Random();
        for(int count = 1; count <= 200; count++){
            int characters = generator.nextInt(65,91);
            System.out.printf("%2c",characters);
            if(count % 10 == 0){

                System.out.println();

            }
        }

        for(int count = 1; count <= 200; count++){
            int randomNumbers = generator.nextInt(10); 
            System.out.printf("%2d",randomNumbers);
            if(count % 10 == 0){

                System.out.println();

            }
        }
 
    }

}
