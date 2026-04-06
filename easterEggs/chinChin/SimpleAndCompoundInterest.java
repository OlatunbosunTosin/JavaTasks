import java.util.Scanner;
public class SimpleAndCompoundInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();
        System.out.print("Enter rate: ");
        double rate = input.nextDouble();
        double simpleInterest = (principal * time * rate) / 100;
        double compoundInterest = principal * (Math.pow((1 + (rate / 100)), time));
        System.out.printf("Simple Interest is %.2f%n Compound Interest is %.2f%n" , simpleInterest, compoundInterest);
       
        
    }
}
