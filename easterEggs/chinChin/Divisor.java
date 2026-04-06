import java.util.Scanner;
public class Divisor{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter m: ");
        int m = input.nextInt();
        System.out.printf("Enter n: ");
        int n = input.nextInt();
        int div = m / n;

        if (n == 0){
            System.out.printf("You cannot divide by 0%n");
        }
        else {
            System.out.printf("%d/%d = %d%n", m, n, div);
        }

    }
}
