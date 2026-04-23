import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        int largest = number;
        
        for(int counter = 1; counter < 10; counter++){

            System.out.print("Enter a number: ");
            number = inputCollector.nextInt();

            if (number > largest){
                 
                largest = number;

            }
  
            
        }System.out.printf("largest number = %d", largest);
}
}
