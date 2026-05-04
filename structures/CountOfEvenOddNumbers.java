import java.util.Scanner;
public class CountOfEvenOddNumbers{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] integers = new int[10];
        int count = 0;
        int evenCounter = 0;
        int Oddcounter = 0;
        for(;count < integers.length; count++){

            System.out.print("Enter integer: ");
            integers[count] = input.nextInt();
            
            if (integers[count] % 2 == 0){
                evenCounter++;
            }

            if (integers[count] % 2 != 0){
                Oddcounter++;
            }
        }System.out.printf("Even numbers: %d%nOdd numbers: %d", evenCounter, Oddcounter);
        
    }
}
