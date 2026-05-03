import java.util.Scanner;

public class LetterLength{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter word: ");
        String word = input.nextLine();
        int numberOfLetters = countLetters(word);
        System.out.printf("Letter count is %d",numberOfLetters);
    }

    public static int countLetters(String s){

        return s.length();

    }

}
