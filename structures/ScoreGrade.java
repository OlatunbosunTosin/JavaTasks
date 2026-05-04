import java.util.Scanner;
public class ScoreGrade{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of Students: ");
        int studentNumber = input.nextInt();
        int[] scores = new int[studentNumber];
        int count = 0;
        int best = scores[0];
        char grade = ' ';
        for(;count < scores.length; count++){

            System.out.print("Enter score: ");
            scores[count] = input.nextInt();
            
            if (scores[count] > best){
                best = scores[count];
            }
        }
            
        for(int counter = 0; counter < scores.length; counter++){
            if (scores[counter] >= best - 5){

                grade = 'A';

            }
            else if (scores[counter] >= best - 10){

                grade = 'B';

            }
            else if (scores[counter] >= best - 15){

                grade = 'C';

            }
            else if (scores[counter] >= best - 20){

                grade = 'D';

            }
            else{

                grade = 'F';

            }System.out.printf("%d\t%c%n",scores[counter],grade);       
        }
        
        
       

    }

}

