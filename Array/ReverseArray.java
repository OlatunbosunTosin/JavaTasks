public class ReverseArray {

    public static void main(String[] args) {

        int[] number = {1, 2, 10,22,22,33,44,5,56,66, 4, 5};
            
        reverseArray(number);
        
        

}
    public static void reverseArray(int[] numberSet){
        
        int firstIndex = 0;
        int lastIndex = numberSet.length -1;
        int container = numberSet[0];
        
        for (; firstIndex < lastIndex; firstIndex++){

            container = numberSet[firstIndex];
            numberSet[firstIndex] = numberSet[lastIndex];
            numberSet[lastIndex] = container;
            
          lastIndex--;
        
        }   
           System.out.println(java.util.Arrays.toString(numberSet));
    }

}
