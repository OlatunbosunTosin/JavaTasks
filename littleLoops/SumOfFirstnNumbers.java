import java.util.Scanner;
public class SumOfFirstnNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int userInput = input.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= userInput)
        {
            sum += i;
            i++;
        }
        System.out.printf("Sum of first %d numbers = %d%n", userInput, sum);
}
}
