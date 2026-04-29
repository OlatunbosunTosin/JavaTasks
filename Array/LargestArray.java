public class LargestArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 10, 4, 5};
            
        int maximumNumber = largestNumber(numbers);
        
        System.out.print(maximumNumber);

}
    public static int largestNumber(int[] numberSet){
        int largest = numberSet[0];
        for(int count = 0; count < numberSet.length; count++){
            
            if (numberSet[count] > largest){
                largest = numberSet[count];
            }
        }return largest;

    }

}
