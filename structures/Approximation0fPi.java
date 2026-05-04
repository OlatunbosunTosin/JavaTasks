import java.util.Scanner;
public class Approximation0fPi{

    public static void main(String[] args){

        for (int counter = 1; counter < 1000; counter += 100){
            double approximation = m(counter);
            System.out.printf("%d\t%f%n",counter,approximation);
        }

    }

    
    public static double m(int number){
        double sum = 0.0;
        double pi = 0.0;
        for(int count = 1; count <= number; count++){
        
            sum += (Math.pow(-1,(count + 1))) / ((2 * count) - 1);
            pi = 4 * sum;
   
        }return pi;
    }

}
