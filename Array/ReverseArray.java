public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 10, 4, 5};
            
        int arrayReverse = reverseArray(numbers);
        
        System.out.print(arrayReverse);

}
    public static int reverseArray(int[] numberSet){
        int number = numberSet.length - 1;
        for ( ;number > 0; number--){
        
            System.out.print(numberSet[number] + " ");

        }return numberSet[number];

    }

}
