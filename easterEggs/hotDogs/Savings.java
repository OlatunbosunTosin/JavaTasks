import java.util.Scanner;
public class Savings{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your monthly savings amount: ");
        double amount = input.nextDouble();
        double interest = 0.003125 * amount * 6;
        double accountValue = amount + interest;
        System.out.printf("Your account value after six months is %.2f%n", accountValue);
    }
}
