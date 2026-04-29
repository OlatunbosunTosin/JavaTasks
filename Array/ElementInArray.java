public class ElementInArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 10, 4, 5};
            
        boolean element = ElementOccurence(numbers);
        
        System.out.print(element);

}
    public static boolean ElementOccurence(int[] numberSet){
        int integer = 6;
        for(int count = 0; count < numberSet.length; count++){
            
            if (integer == numberSet[count]){
                return true;
            }
            else if (integer != numberSet[count]){
                
            }
            
        }return false;
    }

}
