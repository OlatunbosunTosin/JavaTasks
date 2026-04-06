import java.util.Random;
public class RandomIntegers{
    public static void main(String[] args){
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(8);
    System.out.printf("%d%n", randomNumber);
    if (randomNumber == 1){
        System.out.print("Violet\n");
    }
    else if (randomNumber == 2){
        System.out.print("Indigo\n");
    }
    else if (randomNumber == 3){
        System.out.print("Blue\n");
    }
    else if (randomNumber == 4){
        System.out.print("Green\n");
    }
    else if (randomNumber == 5){
        System.out.print("Yellow\n");
    }
    else if (randomNumber == 6){
        System.out.print("Orange\n");
    }
    else if (randomNumber == 7){
        System.out.print("Red\n");
    }

}
}
