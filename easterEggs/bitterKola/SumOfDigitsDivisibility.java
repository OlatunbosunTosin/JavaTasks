import java.util.Scanner;
public class SumOfDigitsDivisibility{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a three digit number: ");
        int num = input.nextInt();
        int firstDigit = num / 10;
        int firstDigitRem = num % 10;
        int secondDigit = firstDigit / 10;
        int secondDigitRem = firstDigit % 10;
        int thirdDigit = secondDigit / 10;
        int thirdDigitRem = secondDigit % 10;
        int sum = firstDigitRem + secondDigitRem + thirdDigitRem;

        if (num % sum == 0){
        System.out.printf("%d is divisible by the sum of its digits %d%n", num, sum);
        }
        else{
        System.out.printf("%d is not divisible by the sum of its digits %d%n", num, sum);
        }
    }
}
