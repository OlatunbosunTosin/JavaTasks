
import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        int sum = 0;

        while(number > 0){

        int lastDigitRemainder = number % 10;
        number = number / 10;
        sum += lastDigitRemainder;
          
        }System.out.print(sum);
      
}
}
