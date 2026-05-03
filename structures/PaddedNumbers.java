import java.util.Scanner;

public class PaddedNumbers{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        System.out.print("Enter width: ");
        int width = input.nextInt();

        String newNumber = format(number, width);
        System.out.print(newNumber);
    }

    public static String format(int number, int width){

        return String.format("%0" + width + "d",number);

    }

}
