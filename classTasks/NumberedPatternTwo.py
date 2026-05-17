import java.util.Scanner;
public class NumberedPatternTwo{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int userInput = input.nextInt();
       for(int number = 1; number <= userInput; number++){
            for(int secondNumber = userInput; secondNumber >= 1; secondNumber--){
                System.out.print(" ");
                
            }
            
        }
    }
}
