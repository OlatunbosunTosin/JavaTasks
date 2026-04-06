import java.util.Scanner;
public class Wage{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter hourly wage: ");
        double hourlyWage = input.nextDouble();
        System.out.print("Enter hours worked: ");
        double hoursWorked = input.nextDouble();
        double totalEarnings; 

        if(hoursWorked <= 40){
            totalEarnings = hourlyWage * hoursWorked;
        System.out.printf("Your total earning is %.2f%n" , totalEarnings);
        }
        else if(hoursWorked > 40){
            totalEarnings = (40 * hourlyWage) + ((hoursWorked - 40) * hourlyWage * 1.5);
        System.out.printf("Your total earning is %.2f%n" , totalEarnings);
        }       
    }
}
