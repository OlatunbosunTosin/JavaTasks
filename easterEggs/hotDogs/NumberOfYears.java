import java.util.Scanner;
public class NumberOfYears{
    public static void main(String[] args){
        Scanner collectMinutes = new Scanner(System.in);
        System.out.print("Enter number of minutes: ");
        int minutes = collectMinutes.nextInt();
        int years = ((minutes / 60) / 24) / 365;
        int days = ((minutes / 60) / 24) % 365;
        System.out.printf("%d minutes is %d years and %d days", minutes, years,days);
    }
}
