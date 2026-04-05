import java.util.Scanner;
public class TriangleType{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first side: ");
        double firstSide = input.nextDouble();
        System.out.print("Enter Enter second side: ");
        double secondSide = input.nextDouble();
        System.out.print("Enter third side: ");
        double thirdSide = input.nextDouble();

        if (firstSide == secondSide && secondSide == thirdSide){
            System.out.printf("It is an equilateral triangle.%n");
        }
        else if (firstSide == secondSide || secondSide == thirdSide || firstSide == thirdSide){
            System.out.printf("It is an Isosceles triangle.%n");
        }
        else 
            System.out.printf("It is a Scalene triangle.%n");

        if (firstSide + secondSide > thirdSide && secondSide + thirdSide > firstSide && firstSide + thirdSide > secondSide){
            System.out.printf("It is a valid triangle.%n");
        }
        else 
            System.out.printf("It is not a valid triangle.%n");
        
    }
}
