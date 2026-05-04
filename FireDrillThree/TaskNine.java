import java.util.Scanner;
public class TaskNine{


    public static int[] oddIndex(int[] arrays){
        
        int[] odd = new int[arrays.length / 2];
        int count = 0;
        int index = 0;
        for(; count < arrays.length; count++){
            if(count % 2 != 0){
                odd[index] = arrays[count];
                index++;
            }    


        }return odd;
    
    }

    public static int minimumNumber(int[] arrays){
        int[] oddIndexNumber = oddIndex(arrays);
        int count = 0;

        int minimum = oddIndexNumber[0];
        for(; count < oddIndexNumber.length; count++){

                if (oddIndexNumber[count] < minimum){
                    minimum = oddIndexNumber[count];
                } 
        } return minimum;
 
    }



}
