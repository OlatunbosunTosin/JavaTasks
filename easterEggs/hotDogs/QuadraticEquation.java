import java.util.Scanner;
public class QuadraticEquation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.printf("Quadratic equation is %dx2 + %dx + %d = 0%n" , a, b, c);
        double discriminant = (b * b) - (4 * a * c);
        double root1 =  (-b + (Math.sqrt(discriminant))) / (2 * a);
        double root2 =  (-b - (Math.sqrt(discriminant))) / (2 * a);
        if (discriminant > 0.0){
            System.out.printf("Root = %.1f and %.1f%n", root1, root2);
        }
        else if (discriminant == 0.0){
            System.out.printf("Root = %.1f%n", root1);
        }
        else
            System.out.printf("The equation has no real roots");
        
    }
}
