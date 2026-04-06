import java.util.Scanner;
public class SumOfConsecutiveNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an Integer: ");
        int number = input.nextInt();
        int sum = (number * (number + 1)) / 2;

        System.out.printf("sum of %d consecutive numbers from 1 = %d%n", number, sum);
        
    }
}
