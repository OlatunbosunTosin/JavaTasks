import java.util.Scanner;
public class RangeOfNumbers{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();

        if (number > 10 && number < 100){
        System.out.printf("%d is between 10 and 100", number);
        }
        else {
        System.out.printf("%d is not between 10 and 100", number);
        }
    }
}
