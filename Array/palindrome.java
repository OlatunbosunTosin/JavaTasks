import java.util.Scanner;
public class palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 5 letter word: "); 
        String word = input.nextLine();       
        
            
        String reverse = palindromeCheck(word);
        
        System.out.print(reverse);

}
    public static String palindromeCheck(String words){
        String newWord = " ";

        for(String character : words){
            newWord = newWord + character;
        }
        return newWord;

    }

}
