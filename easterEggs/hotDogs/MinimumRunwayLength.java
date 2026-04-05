import java.util.Scanner;
public class MinimumRunwayLength{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter velocity: ");
        double velocity = input.nextDouble();
        System.out.print("Enter acceleration: ");
        double acceleration = input.nextDouble();
        double length = (velocity * velocity) / (2 * acceleration);
        System.out.printf("Minimum runway length = %.2fm%n" , length);
    }
}
