import java.util.Scanner;

public class PasswordValidator{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String userPassword = input.nextLine();
        isValidPassword(userPassword);

    }

    public static boolean isValidPassword(String password){

        if (password.length() >= 10 &&  
        



 
    }

}
