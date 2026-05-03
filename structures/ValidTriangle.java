import java.util.Scanner;

public class ValidTriangle{

public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double firstSide = input.nextDouble();
        System.out.print("Enter Enter second side: ");
        double secondSide = input.nextDouble();
        System.out.print("Enter third side: ");
        double thirdSide = input.nextDouble();

        double areaOfTriangle = area(firstSide, secondSide, thirdSide);
        System.out.printf("Area of triangle = %.2f", areaOfTriangle);

    }

    public static boolean isValid(double side1, double side2, double side3){
        boolean valid = false;
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2){
            valid = true;

        }
        
        return valid;

    }


    public static double area(double side1, double side2, double side3){
        boolean triangle = isValid(side1, side2, side3);
        double area = 0.0;
        if (triangle == true){
            double s = (side1 + side2 + side3) / 2;
            area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        return area;
        

    }

}
