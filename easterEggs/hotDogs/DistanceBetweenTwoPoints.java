import java.util.Scanner;
public class DistanceBetweenTwoPoints{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = input.nextInt();
        System.out.print("Enter x2: ");
        int x2 = input.nextInt();
        System.out.print("Enter y1: ");
        int y1 = input.nextInt();
        System.out.print("Enter y2: ");
        int y2 = input.nextInt();
        double distance = Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1)));
        System.out.printf("Distance between the two points = %.2f%n" , distance);
    }
}
