import java.util.Scanner;
public class PrintOneToUserInput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int userInput = input.nextInt();
        int i = 1;
        while (i <= userInput)
        {
            System.out.println(i);
            i++;
        }
}
}
