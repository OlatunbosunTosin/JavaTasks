import java.util.Scanner;
public class ReversePalindrome{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");  
        int integer = input.nextInt();
        isPalindrome(integer);

    }

    
    public static int reverse(int number){
        int reversed = 0;
        while(number != 0){

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }
        return  reversed;
    }

    
    public static boolean isPalindrome(int number){
    
        boolean palindrome = false;
        int reversedNumber = reverse(number);
        if (number == reversedNumber){
            palindrome = true;
        }System.out.print(palindrome);
        return palindrome;

    }


}
