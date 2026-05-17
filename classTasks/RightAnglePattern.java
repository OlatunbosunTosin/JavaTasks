import java.util.Scanner;
public class RightAnglePattern{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int userInput = input.nextInt();
       for(int number = 1; number <= userInput; number++){
            for(int secondNumber = userInput; secondNumber >= 1; secondNumber--){
         if (number >= secondNumber){
                    System.out.print("*");
         }
         else{
                    System.out.print(" ");
                }
        }System.out.println();
    }
}
}
