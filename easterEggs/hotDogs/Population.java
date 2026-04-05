import java.util.Scanner;
public class Population{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        int currentPopulation = 312032486; 
        int birthRate = (60 * 60 * 24 * 365) / 7;
        int deathRate = (60 * 60 * 24 * 365) / 13;
        int newImmigrant = (60 * 60 * 24 * 365) / 45;
        int additionalPopulation = birthRate + newImmigrant - deathRate;
        int newPopulationYear1 = currentPopulation + additionalPopulation;
        int newPopulationYear2 = newPopulationYear1 + additionalPopulation;
        int newPopulationYear3 = newPopulationYear2 + additionalPopulation;
        int newPopulationYear4 = newPopulationYear3 + additionalPopulation;
        int newPopulationYear5 = newPopulationYear4 + additionalPopulation;
        System.out.printf("The popultion for the next %d years are %d,%d,%d,%d,%d", years, newPopulationYear1, newPopulationYear2, newPopulationYear3, newPopulationYear4, newPopulationYear5);
    }
}

