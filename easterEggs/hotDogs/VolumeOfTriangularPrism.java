import java.util.Scanner;
public class VolumeOfTriangularPrism{
    public static void main(String[] args){
        Scanner collectLength = new Scanner(System.in);
        System.out.print("Enter length of sides: ");
        double lengthOfSides = collectLength.nextDouble();
        System.out.print("Enter height of Prism: ");
        double height = collectLength.nextDouble();
        double area = (Math.sqrt(3) / 4) * lengthOfSides * lengthOfSides ;
        double volume = area * height;
        System.out.printf("volume of the Triangle = %.2f cm", volume);
    }
}
