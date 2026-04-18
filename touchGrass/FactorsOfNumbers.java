import java.util.Scanner;
public class FactorsOfNumbers{
    public static void main(String[] args){
        Scanner factorCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userInput = factorCollector.nextInt();
        for(int number = 1; number <= userInput; number++){
            if (userInput % number == 0){
                System.out.print(number + "," );
            }
            
        }
    }
}
