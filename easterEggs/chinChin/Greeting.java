import java.util.Scanner;
public class Greeting{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter between 0 - 23: ");
    int CurrentHour = input.nextInt();
    
    if (CurrentHour >= 5 && CurrentHour <= 11){
        System.out.printf("Good Morning%n");
    } 
    else if (CurrentHour >= 12 && CurrentHour <= 17){
        System.out.printf("Good Afternoon%n");
    } 
    else if (CurrentHour >= 18 && CurrentHour <= 21){
        System.out.printf("Good Evening%n");
    } 
    else if (CurrentHour >= 22 && CurrentHour <= 23){
        System.out.printf("Good Night%n");
    } 
    else if (CurrentHour >= 0 && CurrentHour <= 4){
        System.out.printf("Good Night%n");
    } 
    else{
        System.out.printf("0nly numbers between 0 - 23%n");
    } 
    }
}
