import java.util.Scanner;
public class ReverseOrder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a four digit integer: ");
        int num = input.nextInt();
        int firstDigit = num / 10;
        int firstDigitRem = num % 10;
        int secondDigit = firstDigit / 10;
        int secondDigitRem = firstDigit % 10;
        int thirdDigit = secondDigit / 10;
        int thirdDigitRem = secondDigit % 10;
        int fourthDigit = thirdDigit / 10;
        int fourthDigitRem = thirdDigit % 10;
           
        System.out.printf("%d = %d%d%d%d%n", num, firstDigitRem, secondDigitRem, thirdDigitRem, fourthDigitRem);
    }
}
