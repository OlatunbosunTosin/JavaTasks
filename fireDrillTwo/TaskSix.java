import java.util.Scanner;
public class TaskSix{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        double average = 0;

        for(int counter = 1; counter <= 10; counter++){
            System.out.print("Enter score: ");
            int score = inputCollector.nextInt();
            if (score % 2 == 0)
            sum += score;
            count += 1;
            average = (double)sum / count;
            System.out.printf("%n",count);
            
        }System.out.printf("Average = %.2f%n", average);
        
}
}
