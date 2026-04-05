import java.util.Scanner;
public class GratuityCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the Subtotal? ");
        double subtotal = input.nextDouble();
        System.out.print("What is the Gratuity rate? ");
        double gratuityRate = input.nextDouble();
        double gratuity = (gratuityRate / 100) *  subtotal;
        double total = subtotal + gratuity;
        System.out.printf("Gratuity = $%.2f and total = $%.2f%n", gratuity, total);
    }
}
