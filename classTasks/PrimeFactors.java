import java.util.Scanner;
public class PrimeFactors{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = inputCollector.nextInt();
        int count = 2;
        int sum = 0;
        for (; count <= number; ){
           
            if (number % count == 0){
                number = number / count;
                sum += count;
                }
            else 
                count++;
                
              
        }
        System.out.println(sum);
       
}
}
