import java.util.Scanner;
public class AnnualTaxOwed{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter monthly salary: ");
        double number = input.nextDouble();
        double taxOwed;
        if(number <= 300000){
        System.out.printf("No tax owed%n");
        }
        else if (number > 300000 && number <= 600000){
            taxOwed = 0.15 * number;
        System.out.printf("Tax owed is %.2f%n", taxOwed);
        }
        else if (number > 600000){
            taxOwed = 0.25 * number;
        System.out.printf("Tax owed is %.2f%n", taxOwed);
        }
    }
}
