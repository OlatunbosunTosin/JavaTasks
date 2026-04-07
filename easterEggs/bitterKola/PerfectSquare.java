import java.util.Scanner;
public class PerfectSquare{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int number = input.nextInt();

        if (Math.sqrt(number) % 1 == 0){
        System.out.printf("%d is a perfect square%n", number);
        }
        else {
        System.out.printf("%d is not a perfect square%n", number);
        }
    }
}
