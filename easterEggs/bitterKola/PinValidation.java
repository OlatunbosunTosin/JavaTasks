import java.util.Scanner;
public class PinValidation{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your four digit PIN between 1000 - 9999: ");
        int number = input.nextInt();

        if(number >= 1000 && number <= 9999){
        System.out.printf("Valid PIN%n");
        }
        else{
        System.out.printf("Invalid PIN%n");
        }

}
}
