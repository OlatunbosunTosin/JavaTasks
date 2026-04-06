import java.util.Random;
import java.util.Scanner;
public class ScissorRockPaper{
    public static void main(String[] args){
        Random generator = new Random();
        int game = generator.nextInt(3);
        Scanner input = new Scanner(System.in); 
        System.out.printf("Scissor(0), Rock(1), Paper(2): ");
        int player = input.nextInt();
        System.out.printf("Computer played %d%n", game);
        if ((game == 0 && player == 0) || (game == 1 && player == 1) || (game == 2 && player == 2)){
            System.out.printf("Draw%n");
        }
        else if ((game == 0 && player == 1) || (game == 1 && player == 2) || (game == 2 && player == 0)){
            System.out.printf("You win%n");
        }
        else if ((game == 1 && player == 0) || (game == 2 && player == 1) || (game == 0 && player == 2)){
            System.out.printf("Computer wins%n");
        }
    }
}
