import java.util.Scanner;
public class RightAngleOppositeFlipPattern{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int userInput = input.nextInt();

    for(int row = 1; row <= userInput; row++){

        for(int space = 1; space <= row; space++){

            System.out.print(" ");
        
        } 

        for(int column = userInput; column >= row; column--){

            System.out.print("*");
        
        }System.out.println();  

    } 

    }
}


/*
 *****
  ****
   ***
    **
     *
*/
