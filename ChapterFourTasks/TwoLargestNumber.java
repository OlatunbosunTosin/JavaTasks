import java.util.Scanner;
public class TwoLargestNumber{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        int largest = number;
        int secondlargest = number;
        
        for(int counter = 1; counter < 10; counter++){

            System.out.print("Enter a number: ");
            number = inputCollector.nextInt();

            if (number > largest){
                 
                largest = number;

            }
            if (secondlargest < largest && secondlargest > number){
                secondlargest = number;
            }
  
            
        }System.out.printf("largest number = %d", largest);
        System.out.printf("second largest number = %d", secondlargest);
}
}
