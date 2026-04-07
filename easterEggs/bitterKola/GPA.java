import java.util.Scanner;
public class GPA{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter grade: ");
        String grade = input.nextLine();

        if (grade.equals("A")){
        System.out.printf("GPA is 4.0");
        }
        else if(grade.equals("B")){
        System.out.printf("GPA is 3.0");
        }
        else if(grade.equals("C")){
        System.out.printf("GPA is 2.0");
        }
        else if(grade.equals("D")){
        System.out.printf("GPA is 1.0");
        }
        else if(grade.equals("F")){
        System.out.printf("GPA is 0.0");
        }
        else{
        System.out.printf("Error");
        }
    }
}
