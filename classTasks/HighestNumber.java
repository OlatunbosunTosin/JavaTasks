public class HighestNumber{
    
    public static void main(String[] args){

    int largestOfThreeNumbers = largestNumber(5, 6, 8);
    System.out.printf("largest of the three numbers = %d%n", largestOfThreeNumbers);
    }

    public static int largestNumber(int numberOne, int numberTwo, int numberThree){
        int largest = numberOne;
        if (numberTwo > largest){
            largest = numberTwo;
        }
        if (numberThree > largest){
            largest = numberThree;
        }
        return largest;

        
    }
}
