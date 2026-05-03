import java.util.Scanner;
public class Investment{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");  
        double investmentAmount = input.nextDouble();
        System.out.print("Enter interest rate: ");  
        double monthInterestRate = input.nextDouble();
        System.out.print("Enter year: ");  
        int years = input.nextInt();
        System.out.println("Year\tfuture values");

        futureInvestmentValue(investmentAmount, monthInterestRate, years);
        
    }

    
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        double futureValues = 0.0;
        for(int count = 1; count <= years; count++){

            futureValues =  investmentAmount * Math.pow((1 + (monthlyInterestRate / 100)), count);
            System.out.printf("%d\t%.4f%n", count,futureValues);

        }
        return futureValues;
    }

}
