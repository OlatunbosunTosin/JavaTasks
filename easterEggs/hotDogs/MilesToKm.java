import java.util.Scanner;
public class MilesToKm{
    public static void main(String[] args){
        Scanner collectMiles = new Scanner(System.in);
        System.out.print("Enter distance in miles: ");
        double miles = collectMiles.nextDouble();
        double Kilometers = miles * 1.6;
        System.out.printf("%.2f miles = %.2f Kilometers%n", miles, Kilometers);
}
}
