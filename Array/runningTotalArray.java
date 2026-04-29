public class runningTotalArray {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 10, 4, 3, 7};
            
        int totalArray = runningTotal(numbers);
        
        System.out.print(totalArray);

}
    public static int runningTotal(int[] numberSet){
        int total = 0;
        for(int integer : numberSet){
            total += integer;
        }
        return total;

    }

}
