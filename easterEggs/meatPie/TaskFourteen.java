import java.util.Scanner;
public class TaskFourteen{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int firstNum = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNum = input.nextInt();
    System.out.print("Enter third number: ");
    int thirdNum = input.nextInt();
    float average = (firstNum + secondNum + thirdNum) / 3;
    System.out.printf("Average is %.2f%n", average);
    }
}
