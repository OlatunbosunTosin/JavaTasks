import java.util.Scanner;
public class AverageOfScores{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = input.nextInt();
        int count = 0;
        int sum = 0;
        double average = 0.0;

        while(score >= 0){
            count++;
            sum += score;
            average = sum / count;
            System.out.print("Enter score: ");
            score = input.nextInt();

        } System.out.print(average);

        

    }

}
            
