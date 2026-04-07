import java.util.Scanner;
public class DecreasingOrder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter firstNum: ");
        int firstNum = input.nextInt();
        System.out.print("Enter secondNum: ");
        int secondNum = input.nextInt();
        System.out.print("Enter thirdNum: ");
        int thirdNum = input.nextInt();
        int smallest = Math.min(firstNum, Math.min(secondNum, thirdNum));
        int largest = Math.max(firstNum, Math.max(secondNum, thirdNum));
        int middle = 0;
        if (smallest == firstNum && largest == secondNum){
            middle = thirdNum;
        }
        else if (smallest == secondNum && largest == thirdNum){
            middle = firstNum;
        }
        else if (smallest == thirdNum && largest == firstNum){
            middle = secondNum;
        }
        else if (smallest == firstNum && largest == thirdNum){
            middle = secondNum;
        }
        else if (smallest == secondNum && largest == firstNum){
            middle = thirdNum;
        }
        else if (smallest == thirdNum && largest == secondNum){
            middle = firstNum;
        } 
        System.out.printf("%d,%d,%d%n", largest, middle, smallest);
    }
}
