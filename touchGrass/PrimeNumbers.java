public class PrimeNumbers{
    public static void main(String[] args){
        for(int number = 2; number <= 1200; number++){
            for(int numbers = 2; numbers <= 1200; numbers++){
                if(number % numbers == 0 &&  number % 1 == number && number % numbers != 0){
                System.out.print(number);
                }
            }

        }
    }
}
