import java.util.Scanner;
public class TaskFive{


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

}
