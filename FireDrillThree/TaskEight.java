import java.util.Scanner;
public class TaskEight{


    public static int[] evenIndex(int[] arrays){
        
        int[] even = new int[(arrays.length + 1) / 2];
        int count = 0;
        int index = 0;
        for(; count < arrays.length; count++){
            if(count % 2 == 0){
                even[index] = arrays[count];
                index++;
            }    


        }return even;
    }

    public static int minimumNumber(int[] arrays){
        int[] evenIndexNumber = evenIndex(arrays);
        int count = 0;

        int minimum = evenIndexNumber[0];
        for(; count < evenIndexNumber.length; count++){

            if (evenIndexNumber[count] < minimum){
                minimum = evenIndexNumber[count];
            } 
        } return minimum;
 
    }



}
