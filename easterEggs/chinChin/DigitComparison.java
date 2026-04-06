import java.util.Scanner;
public class DigitComparison{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a two digit number: ");
        int number = input.nextInt();
        int tensDigit = number / 10;
        int unitsDigit = number % 10;

        if (tensDigit > unitsDigit){
            System.out.printf("%d is greater than %d%n", tensDigit, unitsDigit);
        }
        else if (tensDigit < unitsDigit){
            System.out.printf("%d is less than %d%n", tensDigit, unitsDigit);
        }
        else if (tensDigit == unitsDigit){
            System.out.printf("%d is equal to %d%n", tensDigit, unitsDigit);
        }
        
    }
}
