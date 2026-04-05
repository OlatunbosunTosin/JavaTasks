import java.util.Scanner;
public class CostOfTrip{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance: ");
        double distanceToTravel = input.nextDouble();
        System.out.print("Enter fuel efficiency: ");
        double fuelEfficiency = input.nextDouble();
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();
        double tripCost = (distanceToTravel / fuelEfficiency) * pricePerGallon;
        System.out.printf("tripCost is %.2f%n" , tripCost);
    }
}
