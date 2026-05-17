import java.util.Arrays;
public class ArrayConcatenation {

    public static void main(String[] args) {

        char[] letterArray = {'a','b','c'};
        int[] numberArray = {1,2,3};
        

        //String combinedArray = concatenation(letterArray, numberArray);
        int[] result = concatenation(letterArray, numberArray);
        System.out.print(Arrays.toString(result));
        
        //System.out.print(combinedArray);

}
    public static int[] concatenation(char[] letters, int[] numberSet){

        int[] newArray = new int[letters.length + numberSet.length];
        int count = 0;
        for(int number = 0; number < letters.length; number++) {
            newArray[count++] = letters[number];
        }

        for(int number = 0; number < numberSet.length; number++) {
            newArray[count++] = numberSet[number];
        }

        return newArray;
    }

}
  
