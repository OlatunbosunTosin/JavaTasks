import java.util.Scanner;
public class SumOfFirstAndLastDigits{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a five digit Integer: ");
        int number = input.nextInt();
        int firstDigit = number / 10;
        int firstDigitRem = number % 10;
        int secondDigit = firstDigit / 10;
        int secondDigitRem = firstDigit % 10;
        int thirdDigit = secondDigit / 10;
        int thirdDigitRem = secondDigit % 10;
        int fourthDigit = thirdDigit / 10;
        int fourthDigitRem = thirdDigit % 10;
        int fifthDigit = fourthDigit / 10;
        int fifthDigitRem = fourthDigit % 10;
        int sum = fifthDigitRem + firstDigitRem;
        
        System.out.printf("The sum of %d and %d is %d%n", fifthDigitRem, firstDigitRem, sum);
}
}
