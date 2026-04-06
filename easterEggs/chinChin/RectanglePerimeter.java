import java.util.Scanner;
public class RectanglePerimeter{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter first edge: ");
        double firstEdge = input.nextDouble();
        System.out.printf("Enter second edge: ");
        double secondEdge = input.nextDouble();
        double perimeter = 2 * (firstEdge + secondEdge);

        if (firstEdge != secondEdge){
            System.out.printf("Permiter = %.2f%n", perimeter);
        }
        else {
            System.out.printf("Input is invalid%n");
        }

    }
}
