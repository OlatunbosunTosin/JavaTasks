
public class FactorialOfNumber{

    public static void main(String[] args){

        factorial(3);
    }

    public static int factorial(int n){
        int factorialOfNumber = 1;

            for(int count = n; count >= 1; count--){
            
                factorialOfNumber *= count;

            }

        return factorialOfNumber;
         
    }

}
