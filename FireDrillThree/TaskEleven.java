import java.util.Scanner;
public class TaskEleven{


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

    public static int maximumNumber(int[] arrays){
        int[] oddIndexNumber = oddIndex(arrays);
        int count = 0;

        int maximum = oddIndexNumber[0];
        for(; count < oddIndexNumber.length; count++){

                if (oddIndexNumber[count] > maximum){
                    maximum = oddIndexNumber[count];
                } 
        } return maximum;
 
    }



}
