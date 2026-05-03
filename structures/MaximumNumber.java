import java.util.Scanner;
public class MaximumNumber{

    public static void main(String[] args){

        max(1,2,3);

    }

    
    public static int max(int numberOne, int numberTwo, int numberThree){
        int largest = numberOne;
        
        if(numberTwo > largest){
            largest = numberTwo;
        }
        if(numberThree > largest){
            largest = numberThree;
        }
        return largest;
   
    }

}
