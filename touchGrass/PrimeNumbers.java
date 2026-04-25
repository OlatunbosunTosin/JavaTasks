import java.util.Scanner;
public class PrimeNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 0;
        int factor = 1; 
        for (;factor <= number; factor++){
            if (number % factor == 0){
                count++;
            } 
        }
        if (count == 2){
            System.out.printf("%d is a prime number%n", number);
        }
        else{
            System.out.printf("%d is not a prime number%n", number);
        }
                
    }
}
