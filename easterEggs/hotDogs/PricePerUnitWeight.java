import java.util.Scanner;
public class PricePerUnitWeight{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight of first rice: ");
        double firstWeight = input.nextDouble();
        System.out.print("Enter price of first rice: ");
        double firstPrice = input.nextDouble();
        System.out.print("Enter weight of second rice: ");
        double secondWeight = input.nextDouble();
        System.out.print("Enter price of second rice: ");
        double secondPrice = input.nextDouble();

        double firstPricePerUnitWeight = firstPrice / firstWeight;
        double secondPricePerUnitWeight = secondPrice / secondWeight;
        if (firstPricePerUnitWeight < secondPricePerUnitWeight){
            System.out.printf("The first rice package has the better price per unit weight which is %.2f%n", firstPricePerUnitWeight);
        }
        else{
            System.out.printf("The second rice package has the better price per unit weight which is %.2f%n", secondPricePerUnitWeight);
        }
    }
}
