import java.util.Scanner;
public class NumberedPattern{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int userInput = input.nextInt();
       for(int number = 1; number <= userInput; number++){
            for(int secondNumber = 1; secondNumber <= number; secondNumber++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
