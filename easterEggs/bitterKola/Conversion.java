import java.util.Scanner;
public class Conversion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter number of bytes: ");
        double bytes = input.nextInt();
        double kilobytes = bytes / 1024;
        double megabytes = kilobytes / 1024;
        double gigibytes = megabytes / 1024;

        System.out.printf("%.2f bytes = %.2f kilobytes, %.2f megabytes, %.2f gigibytes%n", bytes, kilobytes, megabytes,gigibytes);
        
    }
}
