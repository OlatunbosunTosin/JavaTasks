import java.util.Scanner;

public class AreaOfPentagon{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter side lemgth: ");
        double length = input.nextDouble();

        double areaOfPentagon = area(length);
        System.out.printf("Area is %.2f",areaOfPentagon);
    }

    public static double area(double side){

        double pentagonArea = (5 * side * side) / (4 * Math.tan(180 / 5));
        return pentagonArea;

    }

}
