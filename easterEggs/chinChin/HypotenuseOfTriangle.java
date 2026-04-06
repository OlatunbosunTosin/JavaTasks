import java.util.Scanner;
public class HypotenuseOfTriangle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter length of adjacent: ");
        int adjacent = input.nextInt();
        System.out.printf("Enter opposite: ");
        int opposite = input.nextInt();
        double hypotenuseSquare = (adjacent * adjacent) + (opposite * opposite);
        double hypotenuse = Math.sqrt(hypotenuseSquare);

        System.out.printf("Hypotenuse is %.2f%n", hypotenuse);

    }
}
