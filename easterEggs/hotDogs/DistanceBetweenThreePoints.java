import java.util.Scanner;
public class DistanceBetweenThreePoints{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = input.nextInt();
        System.out.print("Enter x2: ");
        int x2 = input.nextInt();
        System.out.print("Enter x3: ");
        int x3 = input.nextInt();
        System.out.print("Enter y1: ");
        int y1 = input.nextInt();
        System.out.print("Enter y2: ");
        int y2 = input.nextInt();
        System.out.print("Enter y3: ");
        int y3 = input.nextInt();
        double side1 = Math.sqrt(((x3-x2) * (x3-x2)) + ((y3-y2) * (y3-y2)));
        double side2 = Math.sqrt(((x3-x1) * (x3-x1)) + ((y3-y1) * (y3-y1)));
        double side3 = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.printf("Area of the triangle = %.2f%n" , area);
    }
}
