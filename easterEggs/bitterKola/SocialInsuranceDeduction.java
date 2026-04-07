import java.util.Scanner;
public class SocialInsuranceDeduction{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter monthly salary: ");
        double salary = input.nextDouble();
        double insuranceDeduction;
        if(salary <= 50000){
            insuranceDeduction = 0.0 * salary;
            System.out.printf("Social Insurance Deduction is %.2f%n", insuranceDeduction);
        }
        if(salary >= 50001 && salary <= 150000){
            insuranceDeduction = 0.05 * salary;
            System.out.printf("Social Insurance Deduction is %.2f%n", insuranceDeduction);
        }
        if(salary >= 150001 && salary <= 500000){
            insuranceDeduction = 0.075 * salary;
            System.out.printf("Social Insurance Deduction is %.2f%n", insuranceDeduction);
        }
        if(salary > 500000){
            insuranceDeduction = 0.1 * salary;
            System.out.printf("Social Insurance Deduction is %.2f%n", insuranceDeduction);
        }        
        
    }
}
