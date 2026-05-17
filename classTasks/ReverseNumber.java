
import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();

        for(;number > 0;){

        int lastDigitRemainder = number % 10;
        number = number / 10;
        System.out.print(lastDigitRemainder);
     
        }
    
}
}
