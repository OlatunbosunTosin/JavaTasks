import java.util.Scanner;
public class TaskTwelve{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int firstNum = input.nextInt();
    System.out.println("Enter second number: ");
    int secondNum = input.nextInt();
    System.out.printf("Your two numbers are %d and %d%n", firstNum, secondNum);
}
}
