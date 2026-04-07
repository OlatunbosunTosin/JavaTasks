import java.util.Scanner;
public class Factor{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.printf("Enter second number: ");
        int secondNumber = input.nextInt();

        if (secondNumber % firstNumber == 0){
        System.out.printf("%d is a factor of %d%n", firstNumber, secondNumber);
        }
        else {
        System.out.printf("%d is not a factor of %d%n", firstNumber, secondNumber);
        }
    }
}
