import java.util.Scanner;
public class DistanceCovered{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Initial velocity: ");
        double velocity = input.nextDouble();
        System.out.print("Enter time: ");
        double time = input.nextDouble();
        System.out.print("Enter acceleration: ");
        double acceleration = input.nextDouble();
        double distanceCovered = (velocity * time) + (0.5 * acceleration * time * time);
        System.out.printf("Distance covered = %.2f m%n", distanceCovered);
    }
}
