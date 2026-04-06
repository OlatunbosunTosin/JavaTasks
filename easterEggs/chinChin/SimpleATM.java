import java.util.Scanner;
public class SimpleATM{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an PIN: ");
        int userPin = input.nextInt();
        int pin = 1234;
        if (userPin == pin){
            System.out.printf("Yor balance is $1000%n");
        }
        else {
            System.out.printf("Incorrect PIN%n");
        }

    }
}
