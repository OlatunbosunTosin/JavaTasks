import java.util.Scanner;
public class SumOfIntegerDigits{
    public static void main(String[] args){
        Scanner collectInteger = new Scanner(System.in);
        System.out.print("Enter Integer between 0 and 1000: ");
        int number = collectInteger.nextInt();
        String newNum = String.format("%d",number);
        int length = newNum.length();
        System.out.print(length);
    }
}
