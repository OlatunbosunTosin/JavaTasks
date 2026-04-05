import java.util.Scanner;
public class EnergyNeededToHeatWater{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of water: ");
        double quantity = input.nextDouble();
        System.out.print("Enter Initial temperature: ");
        double initialTemperature = input.nextDouble();
        System.out.print("Enter final temperature: ");
        double finalTemperature = input.nextDouble();
        double energyNeeded = quantity * (finalTemperature - initialTemperature) * 4184;
        System.out.printf("Energy needed to heat %.1f kg of water is %.1f J %n", quantity, energyNeeded);
    }
}
