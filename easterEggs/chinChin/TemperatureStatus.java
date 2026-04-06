import java.util.Scanner;
public class TemperatureStatus{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a temperature in degree celcius: ");
        double temperature = input.nextDouble();
        
        if (temperature < 0){
            System.out.printf("Freezing%n");
        }
        else if (temperature >= 0 && temperature <= 15){
            System.out.printf("Cold%n");
        }
        else if (temperature >= 16 && temperature <= 25){
            System.out.printf("Warm%n");
        }
        else if (temperature > 25){
            System.out.printf("Hot%n");
        }

    }
}
