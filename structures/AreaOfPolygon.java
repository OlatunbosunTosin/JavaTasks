import java.util.Scanner;

public class AreaOfPolygon{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter side lemgth: ");
        double length = input.nextDouble();
        System.out.print("Enter number of sides: ");
        int sideNumber = input.nextInt();

        double areaOfPolygon = area(sideNumber, length);
        System.out.printf("Area is %.2f",areaOfPolygon);
    }

    public static double area(int numberOfSides, double side){

        double polygonArea = (numberOfSides * side * side) / (4 * Math.tan(180 / numberOfSides));
        return polygonArea;

    }

}
