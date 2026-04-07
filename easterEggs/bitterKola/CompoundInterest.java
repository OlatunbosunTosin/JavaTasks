import java.util.Scanner;
public class CompoundInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter bank balance: ");
        double bankBalance = input.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        double firstYearCompoundInterest = bankBalance * (Math.pow((1 + (annualInterestRate / 100)), 1));
        double newBankBalance1 = bankBalance + firstYearCompoundInterest;

        double secondYearCompoundInterest = newBankBalance1 * (Math.pow((1 + (annualInterestRate / 100)), 1));
        double newBankBalance2 = newBankBalance1 + secondYearCompoundInterest;

        double thirdYearCompoundInterest = newBankBalance2 * (Math.pow((1 + (annualInterestRate / 100)), 1));
        double newBankBalance3 = newBankBalance2 + secondYearCompoundInterest;   
    
        System.out.printf("Compound Interest after 1 year is %.2f%n, after 2 year is %.2f%n and after 3 year is %.2f%n", newBankBalance1, newBankBalance2, newBankBalance3);
       
        
    }
}
