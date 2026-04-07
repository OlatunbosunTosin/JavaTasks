import java.util.Scanner;
public class Dollars{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter an amount between 1 - 10: ");
        String amount = input.nextLine();

        if(amount.equals("$1")){
        System.out.printf("%s = One dollars%n", amount);
        }
        else if(amount.equals("$2")){
        System.out.printf("%s = Two dollars%n", amount);
        }
        else if(amount.equals("$3")){
        System.out.printf("%s = Three dollars%n", amount);
        }
        else if(amount.equals("$4")){
        System.out.printf("%s = Four dollars%n", amount);
        }
        else if(amount.equals("$5")){
        System.out.printf("%s = Five dollars%n", amount);
        }
        else if(amount.equals("$6")){
        System.out.printf("%s = Six dollars%n", amount);
        }
        else if(amount.equals("$7")){
        System.out.printf("%s = Seven dollars%n", amount);
        }
        else if(amount.equals("$8")){
        System.out.printf("%s = Eight dollars%n", amount);
        }
        else if(amount.equals("$9")){
        System.out.printf("%s = Nine dollars%n", amount);
        }
        else if(amount.equals("$10")){
        System.out.printf("%s = Ten dollars%n", amount);
        }

}
}
