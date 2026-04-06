import java.util.Scanner;
public class Multiples{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Integer: ");
    int number = input.nextInt();
    
    if (number % 5 == 0){
        System.out.printf("HiFive%n");
    } 
    else{
        System.out.printf("");
    }

    if (number % 2 == 0){
        System.out.printf("HiEven%n");
    } 
    else{
        System.out.printf("");
    }
  
}
}
