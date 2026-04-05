import java.util.Scanner;
public class MetersToFeet{
    public static void main(String[] args){
        Scanner collectMeter = new Scanner(System.in);
        System.out.print("Enter length in miles: ");
        double length = collectMeter.nextDouble();
        double feet = length * 3.2786;
        System.out.printf("%.2f meters = %.2f feet%n", length, feet);
}
}
