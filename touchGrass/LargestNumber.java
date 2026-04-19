import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
        Scanner numberCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = numberCollector.nextInt();
        int largest = number;
        int count = 0;
        while (number != 0){
            System.out.print("Enter a number: ");
            number = numberCollector.nextInt();
            count++;
            if (number > largest){
                largest = number;
            }
            
        }System.out.print(largest);
    }
}
    
