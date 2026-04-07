import java.util.Scanner;
public class AgeCalculator{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter your birth year: ");
        int birthYear = input.nextInt();
        System.out.printf("Enter current year: ");
        int currentYear = input.nextInt();
        int age = currentYear - birthYear;

        if(age < 65){
        System.out.printf("Your age is %d, you are not eligible for a senior citizen discount%n", age);
        }
        else if(age >= 65){
        System.out.printf("Your age is %d, you are eligible for a senior citizen discount%n", age);
        }
    }
}
