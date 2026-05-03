import java.util.Scanner;
public class Pattern{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");  
        int integer = input.nextInt();
        displayPattern(integer);
        
    }

    
    public static void displayPattern(int number){
        
        for (int row = 1; row <= number; row++){
            
            for(int column = 1; column < row; column++){

                System.out.printf("%2d",column);

            }System.out.println();

        }
        for (int lastrow = number; lastrow >= 1; lastrow--){
            System.out.printf("%2d",lastrow);
        }
    }

}
