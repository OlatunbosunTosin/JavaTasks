import java.util.Scanner;
public class TaskEight{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int sum = 0;
  
        for(int counter = 1; counter <= 10; ){
            
            System.out.print("Enter score: ");
            int score = inputCollector.nextInt();
                if (score >= 0 && score <= 100){
                    sum += score;
                    counter++; 
                }
        }System.out.printf("Sum = %d", sum);
}
}
