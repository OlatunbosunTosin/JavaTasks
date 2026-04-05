import java.util.Scanner;
public class BMI{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();
        double newWeight = weight * 0.45359237;
        double newHeight = height * 0.0254;
        double BodyMassIndex =  newWeight/ (newHeight * newHeight);
        System.out.printf("Your BMI = %.2f%n" , BodyMassIndex);
    }
}
