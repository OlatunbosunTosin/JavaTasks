import java.util.Scanner;
public class ShippingCost{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter weight of package: ");
        double weight = input.nextDouble();

        if (weight > 0 && weight <= 2){
            System.out.printf("Shipping is $%.1f%n", 2.5);
        }
        else if (weight > 2 && weight <= 4){
            System.out.printf("Shipping is $%.1f%n", 4.5);
        }
        else if (weight > 4 && weight <= 10){
            System.out.printf("Shipping is $%.1f%n", 7.5);
        }
        else if (weight > 10 && weight <= 20){
            System.out.printf("Shipping is $%.1f%n", 10.5);
        }
        else if (weight > 20){
            System.out.printf("The package cannot be shipped%n");
        }
        else{
            System.out.printf("Try again");
        }
    }
}
