import java.util.Scanner;
public class TaskTwenty{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter length: ");
    float length = input.nextFloat();
    System.out.print("Enter width: ");
    float width = input.nextFloat();
    float area = length * width;
    System.out.printf("Area = %.2f%n", area);
    }
}
