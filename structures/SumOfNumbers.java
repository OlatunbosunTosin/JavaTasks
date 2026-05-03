import java.util.Scanner;
public class SumOfNumbers{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        long n = input.nextLong();
        sumDigits(n);
        
    }

    public static int sumDigits(long n){
        int sum = 0;
        long digit = 0;
        while (n != 0){

            digit = n % 10;
            n = n / 10;
            sum += digit;
        }

        System.out.print(sum);
        return sum;
    }

}
