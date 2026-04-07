import java.util.Scanner;
public class Divisible{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();

        if(number % 5 == 0 && number % 3 == 0){
        System.out.printf("FizzBuzz%n");
        }
        else if(number % 3 == 0){
        System.out.printf("Fizz%n");
        }
        else if (number % 5 == 0){
        System.out.printf("Buzz%n");
        }
        else if(number % 5 != 0 && number % 3 != 0){
        System.out.printf("%d%n", number);
        }

}
}
