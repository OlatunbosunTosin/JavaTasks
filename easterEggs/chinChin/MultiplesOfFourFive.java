import java.util.Scanner;
public class MultiplesOfFourFive{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an Integer: ");
        int num = input.nextInt();

        if (num % 4 == 0 && num % 5 == 0){
            System.out.printf("%d is divisible by 4 and 5%n", num);
        }
        else {
            System.out.printf("%d is not divisible by 4 and 5%n", num);
        }

        if (num % 4 == 0 || num % 5 == 0){
            System.out.printf("%d is divisible by 4 or 5%n", num);
        }
        else {
            System.out.printf("%d is not divisible by 4 or 5%n", num);
        }

        if (num % 4 != 0 && num % 5 == 0 || num % 4 == 0 && num % 5 != 0){
            System.out.printf("%d is divisible by 4 or 5 but not both%n", num);
        }
        else {
            System.out.printf("%d is not divisible by 4 or 5 and both %n", num);
        }

    }
}
