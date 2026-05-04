import java.util.Scanner;
public class TaskSix{


    public static int evenIndexSum(int[] arrays){
        
        int[] even = new int[(arrays.length + 1) / 2];
        int count = 0;
        int index = 0;
        int sum = 0;
        for(; count < arrays.length; count++){
            if(count % 2 == 0){
                even[index] = arrays[count];
                sum += even[index];
                index++;
                
            }

        }return sum;


        
    
    }

}
