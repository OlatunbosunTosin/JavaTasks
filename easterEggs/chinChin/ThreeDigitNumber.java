import java.util.Scanner;
public class ThreeDigitNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an Integer: ");
        int num = input.nextInt();
        int length = String.format("%d",num).length();

        if (length == 3){
            System.out.printf("%d is a three-digit number%n", num);
        }
        else {
            System.out.printf("%d is not a three-digit number%n", length);
        }

    }
}
