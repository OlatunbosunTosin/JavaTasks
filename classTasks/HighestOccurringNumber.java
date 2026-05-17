import java.util.Arrays;
public class HighestOccurringNumber{


    public static void main(String[] args){

        int[] number = {1,2,1,2,5,2,4,5};
        int[] reoccurring = occurringNumber(number);
        System.out.print(Arrays.toString(reoccurring));


    }

    public static int[] occurringNumber(int[] numbers){
        int[] reoccurringArray = new int [numbers.length];
        int index = 0; 
        for(; index < numbers.length; index++){
            int count = 0;
            for(int indexes = index + 1; indexes < numbers.length; indexes++){
                if (numbers[indexes] == numbers[index]){
                    count++;
                }
            
                if (count > 1){
                    reoccurringArray[index] = numbers[indexes];
                }

        }}return reoccurringArray;


    }

}
