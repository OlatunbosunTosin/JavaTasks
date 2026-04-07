import java.util.Scanner;
public class VehicleSpeed{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter speed of vehicle: ");
        double speed = input.nextDouble();
  
        if(speed == 0){
            System.out.printf("Vehicle is Stationary%n");
        }
        else if (speed >= 1 && speed <= 40){
            System.out.printf("Vehicle is Slow%n");
        }
        else if (speed >= 41 && speed <= 80){
            System.out.printf("Vehicle is Moderate%n");
        }
        else if (speed >= 81 && speed <= 120){
            System.out.printf("Vehicle is Fast%n");
        }
        else if (speed > 120){
            System.out.printf("Vehicle is Dangerously Fast%n");
        }
    }
}
