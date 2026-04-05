import java.util.Scanner;
public class StudentScore{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score between 0 - 100: ");
        double Score = input.nextDouble();

        if (Score >= 90 && Score <= 100){
            System.out.printf("A.%n");
        }
        else if (Score >= 80 && Score <= 89){
            System.out.printf("B.%n");
        }
        else if (Score >= 70 && Score <= 79){
            System.out.printf("C.%n");
        }
        else if (Score >= 60 && Score <= 69){
            System.out.printf("D.%n");
        }
        else if (Score < 60){
            System.out.printf("F.%n");
        }
        else
            System.out.printf("Error%n");
    }
}
