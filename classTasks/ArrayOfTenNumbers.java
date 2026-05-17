import java.util.Scanner;
public class ArrayOfTenNumbers{
    public static void main(String[] args){
        int[] arrayList = new int[10];
        Scanner input = new Scanner(System.in);

        for(int count = 0; count < arrayList.length; count++){
            System.out.print("Enter a number: ");
            arrayList[count] = input.nextInt();

        }
        
        for(int number = 0; number < arrayList.length; number++){
            System.out.print(arrayList[number] + " ");
        }        

    }
}
