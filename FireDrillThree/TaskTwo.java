import java.util.Scanner;
public class TaskTwo{

    public static void main(String[] args){
        
        int[] scores = new int[10];
        for(int count = 0; count < scores.length; count++){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter Score: ");
            scores[count] = input.nextInt();

        }

        for(int number = 0; number < scores.length; number++){

            System.out.println(scores[number]);

        }
        
    
    }

}
