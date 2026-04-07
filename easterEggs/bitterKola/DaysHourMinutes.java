import java.util.Scanner;
public class DaysHourMinutes{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter time minutes: ");
        int minutes = input.nextInt();
        int days = (minutes / 60) / 24;
        int hours = ((minutes / 60) % 24);
        int remainingMinutes = minutes % 60;

        System.out.printf("%d minutes is %d day(s), %d hours and %d minutes%n", minutes, days, hours, remainingMinutes);
      
    }
}
