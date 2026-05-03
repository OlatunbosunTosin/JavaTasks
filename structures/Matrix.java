import java.util.Scanner;
import java.util.Random;

public class Matrix{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        printMatrix(number);

    }

    public static void printMatrix(int n){

        Random generator = new Random();

        for(int row = 1; row <= n; row++){

            for(int column = 1; column <= n; column++){

                int randomNumbers =  generator.nextInt(2); 
                System.out.print(randomNumbers);

            }System.out.println();

        }
 
    }

}
