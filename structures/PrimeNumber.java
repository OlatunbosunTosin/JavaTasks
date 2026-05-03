import java.util.Scanner;
public class PrimeNumber{

    public static void main(String[] args){

        isPrime(2);

    }

    
    public static boolean isPrime(int number){
        boolean prime = false;
        int count = 0;
        for(int factors = 1; factors <= number; factors++){

            if(number % factors == 0){

                count++;

            }

        }
        if (count == 2){
            prime = true;
        }
        return prime;
   
    }

}
