import java.util.Scanner;
public class AreaOfTriangle{
    public static void main(String[] args){
        Scanner collectLength = new Scanner(System.in);
        System.out.print("Enter length of sides: ");
        double lengthOfSides = collectLength.nextDouble();
        double area = (Math.sqrt(3) / 4) * lengthOfSides * lengthOfSides;
        System.out.printf("Area of the Triangle = %.2f%n", area);
}
}
