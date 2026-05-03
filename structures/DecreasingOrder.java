import java.util.Scanner;
public class DecreasingOrder{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an first number: ");  
        double firstNumber = input.nextDouble();
        System.out.print("Enter an second number: ");  
        double secondNumber = input.nextDouble();
        System.out.print("Enter an third number: ");  
        double thirdNumber = input.nextDouble();
        displaySortedNumbers(firstNumber, secondNumber, thirdNumber);

    }

    
    public static void displaySortedNumbers(double numberOne, double numberTwo, double numberThree){
        double largest = numberOne;
        double smallest = numberOne;
        double middle = 0;
        if(numberTwo > largest){
            largest = numberTwo;
        }
        if(numberThree > largest){
            largest = numberThree;
        }

        if(numberTwo < smallest){
            smallest = numberTwo;
        }
        if(numberThree < smallest){
            smallest = numberThree;
        }

        if (numberOne == largest && numberTwo == smallest){
            middle = numberThree;
        }
        else if (numberOne == largest && numberThree == smallest){
            middle = numberTwo;
        }
        else if (numberTwo == largest && numberThree == smallest){
            middle = numberOne;
        }
        else if (numberTwo == largest && numberOne == smallest){
            middle = numberThree;
        }
        else if (numberThree == largest && numberOne == smallest){
            middle = numberTwo;
        }
        else if (numberThree == largest && numberTwo == smallest){
            middle = numberOne;
        }

        System.out.printf("%.1f,%.1f,%.1f", largest, middle, smallest);
    }

}
