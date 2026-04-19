import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
        Scanner numberCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = numberCollector.nextInt();
        int largest = number;
        int count = 0;
        while (number != 0){

            if (number > largest){
                largest = number;
                count = 1;
            }
            else if (number == largest){
                count += 1;
            }
            System.out.print("Enter a number: ");
            number = numberCollector.nextInt();
            
        }System.out.printf("Largest number is %d and it occurred %d time", largest, count);
    }
}
    
