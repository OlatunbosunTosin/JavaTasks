
import java.util.Scanner;
public class SquareOfDigits{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        int sum = 0;

        for(;number > 0;){

        int lastDigitRemainder = number % 10;
        number = number / 10;
        int square = lastDigitRemainder * lastDigitRemainder; 
        System.out.println(square);
        }
    
}
}
