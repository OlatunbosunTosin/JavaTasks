import java.util.Scanner;
public class Divisor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        if (num % 2 == 0){
            System.out.printf("%d is divisible by %d%n", num, 2);
        }
        else
            System.out.printf("%d is not divisible by %d%n", num, 2);
        if (num % 3 == 0){
            System.out.printf("%d is divisible by %d%n", num, 3);
        }
        else
            System.out.printf("%d is not divisible by %d%n", num, 3);
        if (num % 5 == 0){
            System.out.printf("%d is divisible by %d%n", num, 5);
        }
        else
            System.out.printf("%d is not divisible by %d%n", num, 5);
        if (num % 7 == 0){
            System.out.printf("%d is divisible by %d%n", num, 7);
        }
        else
            System.out.printf("%d is not divisible by %d%n", num, 7);
        
    }
}
