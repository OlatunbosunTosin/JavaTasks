import java.util.Scanner;
public class SquareMetersToPing{
    public static void main(String[] args){
        Scanner collectSquareMeter = new Scanner(System.in);
        System.out.print("Enter number in SquareMeter: ");
        double number = collectSquareMeter.nextDouble();
        double ping = number * 0.3025;
        System.out.printf("%.2f SquareMeter = %.2f ping%n", number, ping);
}
}
