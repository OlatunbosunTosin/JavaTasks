import java.util.Scanner;
public class TaskTwentyOne{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter base: ");
    double base = input.nextFloat();
    System.out.print("Enter height: ");
    double height = input.nextFloat();
    double area = 0.5 * (base * height);
    System.out.printf("Area = %.2f%n", area);
    }
}
