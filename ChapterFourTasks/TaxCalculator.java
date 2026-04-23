import java.util.Scanner;
public class TaxCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("What is your earning: ");
        double earning = inputCollector.nextDouble();
        double tax = 0;

        if (earning == 30000){
            
            tax = (15 / 100) * earning;
            System.out.printf("tax = %.2f", tax);

        }
            
        else if (earning > 30000){

            tax = (20 / 100) * earning;
            System.out.printf("tax = %.2f", tax);
            

        }
}
}
