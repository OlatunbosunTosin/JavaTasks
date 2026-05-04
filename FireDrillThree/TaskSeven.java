import java.util.Scanner;
public class TaskSeven{


    public static int oddIndexSum(int[] arrays){
        
        int[] odd = new int[(arrays.length + 1) / 2];
        int count = 0;
        int index = 0;
        int sum = 0;
        for(; count < arrays.length; count++){
            if(count % 2 != 0){
                odd[index] = arrays[count];
                sum += odd[index];
                index++;
                
            }

        }return sum;


        
    
    }

}
