import java.util.Scanner;
public class SumOfDigits{
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
        System.out.printf("Sum of %d digits is %d%n", num, sum);
    }
}
