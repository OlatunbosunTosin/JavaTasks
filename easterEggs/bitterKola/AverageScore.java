import java.util.Scanner;
public class AverageScore{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first exam score: ");
        double firstScore = input.nextDouble();
        System.out.print("Enter second exam score: ");
        double secondScore = input.nextDouble();
        System.out.print("Enter third exam score: ");
        double thirdScore = input.nextDouble();
        
        double lowest = Math.min(firstScore, Math.min(secondScore, thirdScore));
        double highest = Math.max(firstScore, Math.max(secondScore, thirdScore));
        double middle = 0;
        if (lowest == firstScore && highest == secondScore){
            middle = thirdScore;
        }
        else if (lowest == secondScore && highest == thirdScore){
            middle = firstScore;
        }
        else if (lowest == thirdScore && highest == firstScore){
            middle = secondScore;
        }
        else if (lowest == firstScore && highest == thirdScore){
            middle = secondScore;
        }
        else if (lowest == secondScore && highest == firstScore){
            middle = thirdScore;
        }
        else if (lowest == thirdScore && highest == secondScore){
            middle = firstScore;
        } 
        
        double weightedAvearge = (0.4 * highest) + (0.35 * middle) + (0.25 * lowest);
        System.out.printf("Weighted average = %.2f%n", weightedAvearge);
    }
}
