import java.util.Scanner;
public class InterestOnBalance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Account balance: ");
        double balance = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();
        double Interest = balance * (annualInterestRate / 1200);
        System.out.printf("Interest for next month is %.2f%n" , Interest);
    }
}
