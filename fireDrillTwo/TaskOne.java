import java.util.Scanner;
public class TaskOne{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        int sum = 0;
        
        
        for(int counter = 1; counter <= 10; counter++){
            System.out.print("Enter score: ");
            int score = inputCollector.nextInt();
            sum += score;   
        }System.out.printf("Sum = %d%n", sum);
        
}
}
