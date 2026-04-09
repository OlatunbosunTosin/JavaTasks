import java.util.Scanner;
public class PrintUserInputToOne{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int userInput = input.nextInt();
        int i = userInput;
        while (i >= 1)
        {
            System.out.println(i);
            i--;
        }
}
}
