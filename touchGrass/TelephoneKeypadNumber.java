import java.util.Scanner;
public class TelephoneKeypadNumber{
    public static void main(String[] args){
        Scanner letterCollector = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = letterCollector.nextLine();
        if (letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("b") || letter.equalsIgnoreCase("c")){
            System.out.printf("Telephone keypad number is 2");
        }
        else if (letter.equalsIgnoreCase("d") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("f")){
            System.out.printf("Telephone keypad number is 3");
        }
        else if (letter.equalsIgnoreCase("g") || letter.equalsIgnoreCase("h") || letter.equalsIgnoreCase("i")){
            System.out.printf("Telephone keypad number is 4");
        }
        else if (letter.equalsIgnoreCase("j") || letter.equalsIgnoreCase("k") || letter.equalsIgnoreCase("l")){
            System.out.printf("Telephone keypad number is 5");
        }
        else if (letter.equalsIgnoreCase("m") || letter.equalsIgnoreCase("n") || letter.equalsIgnoreCase("o")){
            System.out.printf("Telephone keypad number is 6");
        }
        else if (letter.equalsIgnoreCase("p") || letter.equalsIgnoreCase("q") || letter.equalsIgnoreCase("r") || letter.equalsIgnoreCase("s")){
            System.out.printf("Telephone keypad number is 7");
        }
        else if (letter.equalsIgnoreCase("t") || letter.equalsIgnoreCase("u") || letter.equalsIgnoreCase("v")){
            System.out.printf("Telephone keypad number is 8");
        }
        else if (letter.equalsIgnoreCase("w") || letter.equalsIgnoreCase("x") || letter.equalsIgnoreCase("y") || letter.equalsIgnoreCase("z")){
            System.out.printf("Telephone keypad number is 9");
        }
        else{
            System.out.printf("Invalid input for non-letters");
        }
}
}
