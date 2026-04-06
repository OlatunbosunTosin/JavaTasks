import java.util.Scanner;
public class ArithmeticOfTwoNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter firstNum: ");
        double firstNum = input.nextDouble();
        System.out.printf("Enter secondNum: ");
        double secondNum = input.nextDouble();
        double largerValue = Math.max(firstNum, secondNum);
        double smallerValue = Math.min(firstNum, secondNum);
        double sum = firstNum + secondNum;
        double difference = firstNum - secondNum;
        double product = firstNum * secondNum;
        double quotient = firstNum / secondNum;
        
        if(secondNum == 0){
            System.out.printf("can't divide by 0%n");
        } 
        else{
        System.out.printf("Sum = %.2f%nDifference = %.2f%nlargerValue = %.2f%nsmallerValue = %.2f%nproduct = %.2f%nquotient = %.2f%n", sum, difference, largerValue, smallerValue, product, quotient);
        }
    }
}
