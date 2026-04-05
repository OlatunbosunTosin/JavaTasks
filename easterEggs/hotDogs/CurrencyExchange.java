import java.util.Scanner;
public class CurrencyExchange{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Exchange rate: ");
        Double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert from dollars to RMB or 1 to convert from RMB to dollars: ");
        int converter = input.nextInt();
        System.out.print("Enter amount to convert: ");
        double amount = input.nextDouble();

        if (converter == 0){
            System.out.printf("%.2fUSD is %.2fRMB", amount, amount * exchangeRate);
        }
        else if (converter == 1){
            System.out.printf("%.2fRMB is %.2fUSD", amount, amount / exchangeRate);
        }
        else
            System.out.printf("Error, choose between 0 and 1");
        
    }
}
