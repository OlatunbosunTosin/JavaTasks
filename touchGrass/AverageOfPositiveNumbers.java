import java.util.Scanner;
public class AverageOfPositiveNumbers{
    public static void main(String[] tosin){
        int count = 0;
        int sum = 0;
        double average = 0;
        Scanner numberCollector = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int integer = numberCollector.nextInt();
        while(integer >= 0){
            count++;
            sum += integer;
            System.out.print("Enter positive number: ");
            integer = numberCollector.nextInt();
            average = (double)sum / count;
            
        }System.out.printf("average = %.2f%n", average);
    }
}
