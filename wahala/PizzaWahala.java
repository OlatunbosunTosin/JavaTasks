import java.util.Scanner;
public class PizzaWahala{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.print(String.format("""
                             PIZZA MENU

        Pizza type          Number of Slices         Price per box
        Sapa size           4                        2,500
        Small Money         6                        2,900
        Big boys            8                        4,000
        Odogwu              12                       5,200     \n"""
));       
        System.out.print("How many guest do you have? ");
        int numberOfGuest = inputCollector.nextInt();

        inputCollector.nextLine();

        System.out.print("What type of pizza do you want? ");
        String typeOfPizza = inputCollector.nextLine();
       
        int quantity = PizzaQuantity(numberOfGuest, typeOfPizza);
        System.out.println("number of pizza boxes = " + quantity);

        int leftOver = LeftOverPizza(numberOfGuest, typeOfPizza);
        System.out.println("left over pizza slices = " + leftOver);

        int amount = PizzaPayment(numberOfGuest, typeOfPizza);
        System.out.println("Amount to be paid = " + amount);
    }


    public static int PizzaQuantity(int guestNumber, String PizzaType){
        int new_guest_number = 0;
        int initial_number_of_pizza = 0;
        int pizzaBoxQuantity = 0;
        if (PizzaType.equalsIgnoreCase("sapa size")){
            initial_number_of_pizza = guestNumber / 4;
            new_guest_number = initial_number_of_pizza * 4;
            if (new_guest_number < guestNumber){
                pizzaBoxQuantity = initial_number_of_pizza + 1;
            }
            else{
                pizzaBoxQuantity = initial_number_of_pizza;
            }
        }

        if (PizzaType.equalsIgnoreCase("small money")){
            initial_number_of_pizza = guestNumber / 6;
            new_guest_number = initial_number_of_pizza * 6;
            if (new_guest_number < guestNumber){
                pizzaBoxQuantity = initial_number_of_pizza + 1;
            }
            else{
                pizzaBoxQuantity = initial_number_of_pizza;
            }
        }

        if (PizzaType.equalsIgnoreCase("big boys")){
            initial_number_of_pizza = guestNumber / 8;
            new_guest_number = initial_number_of_pizza * 8;
            if (new_guest_number < guestNumber){
                pizzaBoxQuantity = initial_number_of_pizza + 1;
            }
            else{
                pizzaBoxQuantity = initial_number_of_pizza;
            }
        }

        if (PizzaType.equalsIgnoreCase("odogwu")){
            initial_number_of_pizza = guestNumber / 12;
            new_guest_number = initial_number_of_pizza * 12;
            if (new_guest_number < guestNumber){
                pizzaBoxQuantity = initial_number_of_pizza + 1;
            }
            else{
                pizzaBoxQuantity = initial_number_of_pizza;
            }
        }
        return pizzaBoxQuantity;    
        
    }


    public static int LeftOverPizza(int guestNumber, String PizzaType){
        int number_of_boxes = PizzaQuantity(guestNumber, PizzaType);
        int pizzaLeftOver = 0;
        if (PizzaType.equalsIgnoreCase("sapa size")){
            pizzaLeftOver = (number_of_boxes * 4) - guestNumber;
            
        }

        else if (PizzaType.equalsIgnoreCase("small money")){
            pizzaLeftOver = (number_of_boxes * 6) - guestNumber;
            
        }

        else if (PizzaType.equalsIgnoreCase("big boys")){
            pizzaLeftOver = (number_of_boxes * 8) - guestNumber;
            
        }

        else if (PizzaType.equalsIgnoreCase("odogwu")){
            pizzaLeftOver = (number_of_boxes * 12) - guestNumber;
            
        }
        return pizzaLeftOver;    
    } 
  

    public static int PizzaPayment(int guestNumber, String PizzaType){
        int number_of_boxes = PizzaQuantity(guestNumber, PizzaType);
        int pizzaAmount = 0;
        if (PizzaType.equalsIgnoreCase("sapa size")){
            pizzaAmount = 2500 * number_of_boxes;
            
        }

        else if (PizzaType.equalsIgnoreCase("small money")){
            pizzaAmount = 2900 * number_of_boxes;
            
        }

        else if (PizzaType.equalsIgnoreCase("big boys")){
            pizzaAmount = 4000 * number_of_boxes;
            
        }

        else if (PizzaType.equalsIgnoreCase("odogwu")){
            pizzaAmount = 5200 * number_of_boxes;
            
        }
        return pizzaAmount;    
    } 

}

