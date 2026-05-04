import java.util.Scanner;
public class ReverseInteger{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int[] integers = new int[10];
        int[] reverseIntegers = new int[10];
        int count = 0;
        int counter = 0;
        int index = integers.length-1;
        for(;count < integers.length; count++){

            System.out.print("Enter integer: ");
            integers[count] = input.nextInt();
            
        }

        for(; counter <= index; count++){

            reverseIntegers[counter] = integers[index];
            index--;
            System.out.print(reverseIntegers[counter]); 
 
        }
 
    }

}

