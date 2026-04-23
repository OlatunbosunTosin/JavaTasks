import java.util.Scanner;
public class CreditLimitCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter balance at beginning of the month: ");
        int balance = inputCollector.nextInt();
        System.out.print("Enter total charges for the month: ");
        int totalCharges = inputCollector.nextInt();
        System.out.print("Enter total credits for the month: ");
        int totalCredits = inputCollector.nextInt();
        System.out.print("Enter allowed credit limit: ");
        int creditLimit = inputCollector.nextInt();
        
        int newBalance = balance + totalCharges - totalCredits;

        if (newBalance > creditLimit){

            System.out.printf("Credit limit exceeded");
        }
            
        else{

            System.out.printf("Credit limit not exceeded");
        }
}
}
