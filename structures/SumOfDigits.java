import java.util.Scanner;
public class SumOfDigits{

    public static void main(String[] args){

        sumDigits(5);
        
    }

    public static int sumDigits(int number){
        int sum = 0;
        int digit = 0;
        while (number != 0){

            digit = number % 10;
            number = number / 10;
            sum += digit;
        }

        return sum;
    }

}
