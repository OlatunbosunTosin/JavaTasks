import java.util.Scanner;
public class DigitReversal{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a two digit integer: ");
        int num = input.nextInt();
        int firstDigit = num / 10;
        int secondDigit = num % 10;
        int reverseDigit = (secondDigit * 10) + firstDigit;

        if (reverseDigit > num){
        System.out.printf("Reversing %d to %d produces a larger number%n", num, reverseDigit);
        }
        else if (reverseDigit < num){
        System.out.printf("Reversing %d to %d produces a smaller number%n", num, reverseDigit);
        }
        else if (reverseDigit == num){
        System.out.printf("Reversing %d to %d produces the same number%n", num, reverseDigit);
        }
    }
}
