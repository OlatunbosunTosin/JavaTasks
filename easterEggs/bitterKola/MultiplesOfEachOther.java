import java.util.Scanner;
public class MultiplesOfEachOther{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a first number: ");
        int firstNumber = input.nextInt();
        System.out.printf("Enter a second number: ");
        int secondNumber = input.nextInt();
        
        if(firstNumber % secondNumber == 0){
        System.out.printf("%d is a multiple of %d %n", firstNumber, secondNumber);
        }
        else{
        System.out.printf("%d is not a multiple of %d %n", firstNumber, secondNumber);
        }
}
}
