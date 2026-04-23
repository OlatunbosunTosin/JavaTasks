import java.util.Scanner;
public class RightAngledTriangle {
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter triangle base number: ");
        int base = inputCollector.nextInt();
        
        for(int row = 1; row <= base; row++){
            for(int column = 1; column <= row; column++){
                System.out.print("*");
            }System.out.println(); 
        }
    } 
}
