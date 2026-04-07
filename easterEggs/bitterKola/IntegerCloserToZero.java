import java.util.Scanner;
public class IntegerCloserToZero{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.printf("Enter second number: ");
        int secondNumber = input.nextInt();
        int firstNumberZero = 0 - firstNumber;
        int secondNumberZero = 0 - secondNumber;

        if (firstNumberZero < secondNumberZero){
        System.out.printf("%d is closer to zero%n", secondNumber);
        }
        else if (firstNumberZero > secondNumberZero){
        System.out.printf("%d is closer to zero%n", firstNumber);
        }
        else if (firstNumberZero == secondNumberZero){
        System.out.printf("%d and %d are equally close to zero%n",firstNumber, secondNumber);
        }
    }
}
