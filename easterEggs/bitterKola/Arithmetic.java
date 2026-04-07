import java.util.Scanner;
public class Arithmetic{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a first number: ");
        int firstNumber = input.nextInt();
        System.out.printf("Enter a second number: ");
        int secondNumber = input.nextInt();
        int sum = firstNumber + secondNumber;  
        int difference; 
        int product = firstNumber * secondNumber;      

        if(firstNumber >= 0 && secondNumber >= 0){
        System.out.printf("Sum of %d and %d is  %d%n", firstNumber, secondNumber, sum);
        }
        else if(firstNumber < 0 && secondNumber < 0){
        System.out.printf("Product of %d and %d is  %d%n", firstNumber, secondNumber, product);
        }
        else if(firstNumber >= 0 && secondNumber <= 0 || firstNumber <= 0 && secondNumber >= 0){
        if (firstNumber > secondNumber){
            difference = firstNumber - secondNumber; 
        }
        else{
            difference = secondNumber - firstNumber;             
        } 
        System.out.printf("Difference of %d and %d is  %d%n", firstNumber, secondNumber, difference);
        }
}
}
