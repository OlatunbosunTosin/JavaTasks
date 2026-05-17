import java.util.Scanner;
public class NumberedPatternTwo{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int userInput = input.nextInt();
       for(int number = userInput; number >= 1; number--){
            for(int secondNumber = number; secondNumber >= number; secondNumber--){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
}
