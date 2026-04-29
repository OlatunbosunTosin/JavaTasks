public class sumOfNumbers {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 10, 4, 3, 7};
            
        int sum = addition(numbers);
        
        System.out.print(sum);

}
    public static int addition(int[] numberSet){
        int total = 0;
/*        for(int integer = 0; integer < numberSet.length; integer++){
            total += numberSet[integer];
       }
         

        int integer = 0;        
        while(integer < numberSet.length){
            total += numberSet[integer];
            integer++;
        }
*/
        int integer = 0; 
        do {
            total += numberSet[integer];
            integer++;
        }
        while(integer < numberSet.length);
         
        return total;
    }

}
