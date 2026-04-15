import java.util.Scanner;
public class BmiClassification{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a weight in Kg: ");
        double weight = input.nextDouble();
        System.out.printf("Enter a height in m: ");
        double height = input.nextDouble();
        double BMI = weight / (height * height);

        if(BMI < 18.5){
        System.out.printf("Underweight%n");
        }
        else if(BMI >= 18.5 && BMI <= 24.9) {
        System.out.printf("Normal%n");
        }
        else if(BMI >= 25 && BMI <= 29.9) {
        System.out.printf("Overweight%n");
        }
        else if(BMI > 30) {
        System.out.printf("Obese%n");
        }
    } 
}
