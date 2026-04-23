import java.util.Scanner;
public class GasMileage{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("Enter miles driven: ");
        int milesDriven = inputCollector.nextInt();
        
        int count = 0;
        int sum = 0;
        double average = 0.0;

        while(milesDriven != -1){
            System.out.print("Enter gallons used: ");
            int gallonsUsed = inputCollector.nextInt();

            count++;
            float milesPerGallon = ((float)milesDriven / gallonsUsed);
            System.out.println("miles per gallon = " + milesPerGallon);
            sum += milesPerGallon;
            average = sum / count;
            System.out.print("Enter miles driven: ");
            milesDriven = inputCollector.nextInt();
            
            
        }
            System.out.printf("Total miles per gallon = %d%n", sum);
            System.out.printf("Average = %.2f%n", average);
    
}
}
