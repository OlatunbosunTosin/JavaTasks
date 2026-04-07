import java.util.Scanner;
public class Fractions{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first numerator: ");
        double numerator1 = input.nextDouble();
        System.out.print("Enter first denominator: ");
        double denominator1 = input.nextDouble();
        System.out.print("Enter second numerator: ");
        double numerator2 = input.nextDouble();
        System.out.print("Enter second denominator: ");
        double denominator2 = input.nextDouble();
        
        double sum = (numerator1 / denominator1) + (numerator2 / denominator2);
        double difference = (numerator1 / denominator1) - (numerator2 / denominator2);
        double product = (numerator1 / denominator1) * (numerator2 / denominator2);
        double quotient = (numerator1 / denominator1) / (numerator2 / denominator2);

        System.out.printf("Fractions are %d/%d and %d/%d%n", numerator1, denominator1, numerator2, denominator2);

        if (denominator1 == 0 || denominator2 == 0){
            System.out.printf("can't divide by 0");
        }
        else {
        System.out.printf("Sum  is %.2f%nDifference is %.2f%nProduct is %.2f%nQuotient is %.2f%n", sum, difference, product, quotient);
        }
    }
}
