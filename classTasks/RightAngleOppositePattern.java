import java.util.Scanner;
public class RightAngledPatternOne{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int userInput = input.nextInt();
    for(int row = 1; row <= userInput; row++){

        for(int column = userInput; column >= row; column--){

            System.out.print("*");            

        }System.out.println();   

    }
      
    }
}
