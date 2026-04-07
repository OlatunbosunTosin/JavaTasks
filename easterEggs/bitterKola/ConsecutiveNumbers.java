import java.util.Scanner;
public class ConsecutiveNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Integer n: ");
        int n = input.nextInt();
        int formula = (n * (n + 1)) / 2; // the formula adds the consecutive numbers from 1 to n

        System.out.println(formula);
        
    }
}
