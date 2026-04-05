import java.util.Scanner;
public class Time{
    public static void main(String[] args){
        Scanner collectSeconds = new Scanner(System.in);
        System.out.print("Enter number of seconds: ");
        int seconds = collectSeconds.nextInt();
        int hours = (seconds / 60) / 60;
        int minutes = ((seconds / 60) % 60) % 60;
        int remainingSeconds = seconds % 60;
        System.out.printf("%d seconds = %d hour, %d minutes, %d seconds%n", seconds, hours, minutes, remainingSeconds);
    }
}

