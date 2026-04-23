import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a five digit integer: ");
        int number = input.nextInt();
        String integer = String.format("%04d",number);
        int length = integer.length();
        
        System.out.print(length);
        
/*
int firstDigit = num / 10;
        int firstDigitRem = num % 10;
        int secondDigit = firstDigit / 10;
        int secondDigitRem = firstDigit % 10;
        int thirdDigit = secondDigit / 10;
        int thirdDigitRem = secondDigit % 10;

        if (firstDigitRem == thirdDigitRem){
        System.out.printf("%d = %d%d%d, It is a Palindrome%n", num, firstDigitRem, secondDigitRem, thirdDigitRem);
        }
        else{
        System.out.printf("%d != %d%d%d, It is not a Palindrome%n", num, firstDigitRem, secondDigitRem, thirdDigitRem);
*/

        
    }
}
