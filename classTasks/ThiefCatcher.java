import java.util.Scanner;
public class ThiefCatcher{

    public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = input.next();
            String[] a =  word.split("");
            System.out.print(java.util.Arrays.toString(a));
            /*while(!word.replace(" ","").equalsIgnoreCase("Thief")){
                System.out.print("Enter a word: ");
                word = input.nextLine();
        
            }*/

        

    }

}
