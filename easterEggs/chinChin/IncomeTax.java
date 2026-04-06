import java.util.Scanner;
public class IncomeTax{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter filing Status: 0 for Single filers, 1 for married filing jointly or qualified widow(er), 2 for married filing separately and 3 for head of household: ");
        int filingStatus = input.nextInt();
        System.out.printf("Enter taxable Income: ");
        double taxableIncome = input.nextDouble();
        double tax;

        if (filingStatus == 0 && taxableIncome >= 0 && taxableIncome <= 8350){
            tax = 0.1 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 0 && taxableIncome >= 8351 && taxableIncome <= 33950){
            tax = 0.15 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 0 && taxableIncome >= 33951 && taxableIncome <= 82250){
            tax = 0.25 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 0 && taxableIncome >= 82251 && taxableIncome <= 171550){
            tax = 0.28 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 0 && taxableIncome >= 171551 && taxableIncome <= 372950){
            tax = 0.33 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 0 && taxableIncome >= 372951){
            tax = 0.35 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }


        if (filingStatus == 1 && taxableIncome >= 0 && taxableIncome <= 16700){
            tax = 0.1 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 1 && taxableIncome >= 16701 && taxableIncome <= 67900){
            tax = 0.15 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 1 && taxableIncome >= 67901 && taxableIncome <= 137050){
            tax = 0.25 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 1 && taxableIncome >= 137051 && taxableIncome <= 208850){
            tax = 0.28 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 1 && taxableIncome >= 208851 && taxableIncome <= 372950){
            tax = 0.33 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 1 && taxableIncome >= 372951){
            tax = 0.35 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }


        if (filingStatus == 2 && taxableIncome >= 0 && taxableIncome <= 8350){
            tax = 0.1 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 2 && taxableIncome >= 8351 && taxableIncome <= 33950){
            tax = 0.15 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 2 && taxableIncome >= 33951 && taxableIncome <= 68525){
            tax = 0.25 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 2 && taxableIncome >= 68526 && taxableIncome <= 104425){
            tax = 0.28 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 2 && taxableIncome >= 104426 && taxableIncome <= 186475){
            tax = 0.33 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 2 && taxableIncome >= 186476){
            tax = 0.35 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }

        if (filingStatus == 3 && taxableIncome >= 0 && taxableIncome <= 11950){
            tax = 0.1 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 3 && taxableIncome >= 11951 && taxableIncome <= 45500){
            tax = 0.15 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 3 && taxableIncome >= 45501 && taxableIncome <= 117450){
            tax = 0.25 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 3 && taxableIncome >= 117451 && taxableIncome <= 190200){
            tax = 0.28 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 3 && taxableIncome >= 190201 && taxableIncome <= 372950){
            tax = 0.33 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }
        else if (filingStatus == 1 && taxableIncome >= 372951){
            tax = 0.35 * taxableIncome;
            System.out.printf("Your tax is %.2f%n", tax);
        }

    }
}
