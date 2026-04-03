import java.util.Scanner;
public class TaskNine{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("What is your favourite colour? ");
    String colour = input.nextLine();
    System.out.printf("You love %s!!!%n", colour);
    }
}
