import java.util.Scanner;
public class CountDown{
    public static void main(String[] args){
        Scanner numberCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = numberCollector.nextInt();
        for(int number = userInput; number >= 1; number--){
            System.out.println(number);
            
        }System.out.println("Blast off!");
    }
}
