import java.util.Scanner;
public class ReverseOfDigits{
    public static void main(String[] args){
        Scanner numberCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = numberCollector.nextInt();
        while (number > 0){
            int lastDigit = number % 10;
            number = number / 10;
            System.out.print(lastDigit);
        }
    }
}
    
