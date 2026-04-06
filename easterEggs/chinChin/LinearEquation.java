import java.util.Scanner;
public class LinearEquation{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();
        System.out.printf("Linear equation is %.2fx + %.2f = %.2f%n" , a, b, c);
        double x = (c - b) / a;

        if (a == 0.0){
            System.out.printf("Equation has no unique solution%n");
        }
        else{
            System.out.printf("x = %.2f%n", x);
        }
        
    }
}
