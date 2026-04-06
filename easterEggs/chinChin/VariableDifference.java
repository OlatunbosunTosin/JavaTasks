import java.util.Random;
public class VariableDifference{
    public static void main(String[] args){
        Random generator = new Random();
        int firstNum = generator.nextInt(10);
        int secondNum = generator.nextInt(10);
        int difference = Math.abs(firstNum - secondNum);
        System.out.printf("Difference between %d and %d is %d%n", firstNum, secondNum, difference);
    }
}
