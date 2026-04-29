public class EvenPositionArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 10, 4, 3};
            
        evenPosition(numbers);
        
        //System.out.print(newNumber);

}
    public static void evenPosition(int[] numberSet){
        //int[] odd = new int[(numberSet.length+1) / 2];
        int count = 0;
        for( ;count < numberSet.length; count ++){
            if (count % 2 != 0){
                System.out.print(numberSet[count]+" "); 
            }
        }
        

    }

}
