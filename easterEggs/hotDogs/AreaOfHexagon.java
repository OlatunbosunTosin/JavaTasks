import java.util.Scanner;
public class AreaOfHexagon{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side of hexagon: ");
        double side = input.nextDouble();
        double area = ((3 * Math.sqrt(3)) / 2) * (side * side);
        System.out.printf("Area of the Hexagon = %.2f%n", area);
    }
}
