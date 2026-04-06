import java.util.Scanner;
public class DaysOfTheMonth{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter month: ");
    String month = input.nextLine();
    System.out.print("Enter year: ");
    int year = input.nextInt();
    
    if (month.equalsIgnoreCase("January")){
        System.out.printf("%s has 31 days%n", month);
    } 
    else if (month.equalsIgnoreCase("February")) {
        if (year % 4 == 0){
            System.out.printf("%s has 29 days%n", month);
        }
        else{
            System.out.printf("%s has 28 days%n", month);
        }
    }  
    else if (month.equalsIgnoreCase("March")){
        System.out.printf("%s has 31 days%n", month);
    }  
    else if (month.equalsIgnoreCase("April")){
        System.out.printf("%s has 30 days%n", month);
    }  
    else if (month.equalsIgnoreCase("May")){
        System.out.printf("%s has 31 days%n", month);
    }  
    else if (month.equalsIgnoreCase("June")){
        System.out.printf("%s has 30 days%n", month);
    }  
    else if (month.equalsIgnoreCase("July")){
        System.out.printf("%s has 31 days%n", month);
    }  
    else if (month.equalsIgnoreCase("August")){
        System.out.printf("%s has 31 days%n", month);
    }  
    else if (month.equalsIgnoreCase("September")){
        System.out.printf("%s has 30 days%n", month);
    }  
    else if (month.equalsIgnoreCase("October")){
        System.out.printf("%s has 31 days%n", month);
    }  
    else if (month.equalsIgnoreCase("November")){
        System.out.printf("%s has 30 days%n", month);
    }  
    else if (month.equalsIgnoreCase("December")){
        System.out.printf("%s has 31 days%n", month);
    }     
    else{
        System.out.printf("Error, try again");
    }

}
}
