import java.util.Scanner;
public class PowerOfTwo{
    public static void main(String[] args){
        Scanner powerCollector = new Scanner(System.in);
        System.out.print("Enter a power: ");
        int power = powerCollector.nextInt();
        for(int number = 1; number <= power; number++){
            int powersOfTwo = (int)Math.pow(2, number);
            System.out.printf("%d,", powersOfTwo);
        }
    }
}
