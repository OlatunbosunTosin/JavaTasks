public class LeapYears{
    public static void main(String[] args){
        int count = 0;
        for(int number = 2000; number <= 2100; number++){
            if (number % 4 == 0){
                System.out.print(number+ " ");
                count++;
            }
            if (count % 10 == 0){
                System.out.println();
            }
        }
    }
}
