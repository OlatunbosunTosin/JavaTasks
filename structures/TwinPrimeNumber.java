import java.util.Scanner;
public class TwinPrimeNumber{

    public static void main(String[] args){

        isPrime(1200);

    }

    
    public static void isPrime(int number){
        int count = 0;
        int factors = 1;
        for(; factors <= number; factors++){

            if(number % factors == 0){

                count++;

            }

        }
        if (count == 2){
            
                System.out.println(factors);
                      
        }System.out.print(factors);

   
    }

}
