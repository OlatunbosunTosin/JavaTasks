import java.util.Scanner;
public class TaskTwentyFour{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int firstNum = input.nextInt();
    System.out.print("Enter second number: ");
    int secondNum = input.nextInt();
    int newFirstNum = secondNum;
    int newSecondNum = firstNum;
    System.out.printf("First number is now %d and Second number is now %d%n", newFirstNum, newSecondNum);
    }
}
