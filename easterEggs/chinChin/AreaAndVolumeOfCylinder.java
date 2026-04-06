import java.util.Scanner;
public class AreaAndVolumeOfCylinder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter radius: ");
        double radius = input.nextDouble();
        System.out.printf("Enter height: ");
        double height = input.nextDouble();
        double surfaceArea = 2 * Math.PI * radius * (radius + height);
        double volume = Math.PI * radius * radius * height;
        System.out.printf("Surface area = %.2f%nVolume = %.2f%n", surfaceArea, volume);
    }
}
