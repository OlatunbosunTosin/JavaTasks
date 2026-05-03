import java.util.Scanner;
public class ReverseNumber{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");  
        int integer = input.nextInt();
        int reversal = reverse(integer);
        System.out.print(reversal);
    }

    
    public static int reverse(int number){
        int reversed = 0;
        while(number != 0){

            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;

        }
        return  reversed;
    }

}
