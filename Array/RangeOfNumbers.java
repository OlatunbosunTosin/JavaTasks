public class RangeOfNumbers{

    public static int getRangeOf(int[] number){

        int range = 0;
        int largest = number[0];
        int smallest = number[0];
        
        for (int index = 0; index < number.length; index++){

            if (number[index] > largest){
                largest = number[index];
            }

            if (number[index] < smallest){
                smallest = number[index];
            }
        }
        range = largest - smallest;
        return range;




    }

} 
