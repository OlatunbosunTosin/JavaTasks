import java.util.Scanner;
public class PowersOfNumbers{
    public static void main(String[] args){
        System.out.println("number\tsquare\tcube \tquadruple");
        for(int number = 1; number <= 5; number++){

            int square = number * number;
            int cube = number * number * number;
            int quadruple = number * number * number  * number;

            
            System.out.println(number + "\t" + square + "\t" + cube + "\t" + quadruple);
  
        }
}
}
