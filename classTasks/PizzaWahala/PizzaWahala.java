public class PizzaWahala{


    public static int PizzaBoxQuantity(int guestNumber, String pizzaType){
        int pizzaQuantity = 0;   
        if (pizzaType == "Sapa size"){
            int pizzaBox = guestNumber / 4;
            int newGuestNumber = pizzaBox * 4;
            if (newGuestNumber < guestNumber){
                pizzaQuantity = pizzaBox + 1;
            }
            else{
                pizzaQuantity = pizzaBox;
            }
            
        }

       else if (pizzaType == "Small Money"){
            int pizzaBox = guestNumber / 6;
            int newGuestNumber = pizzaBox * 6;
            if (newGuestNumber < guestNumber){
                pizzaQuantity = pizzaBox + 1;
            }
            else{
                pizzaQuantity = pizzaBox;
            }
            
        }

      else if (pizzaType == "Big boys"){
            int pizzaBox = guestNumber / 8;
            int newGuestNumber = pizzaBox * 8;
            if (newGuestNumber < guestNumber){
                pizzaQuantity = pizzaBox + 1;
            }
            else{
                pizzaQuantity = pizzaBox;
            }
            
       }

      else if (pizzaType == "Odogwu"){
            int pizzaBox = guestNumber / 12;
            int newGuestNumber = pizzaBox * 12;
            if (newGuestNumber < guestNumber){
                pizzaQuantity = pizzaBox + 1;
            }
            else{
                pizzaQuantity = pizzaBox;
            }
            
        }

        return pizzaQuantity;

    }

    public static int PizzaSliceLeftOver(int guestNumber, String pizzaType){
        int numberOfBoxes = PizzaBoxQuantity(guestNumber, pizzaType);
        int pizzaLeftOver = 0;
        if (pizzaType == "Sapa size"){

            pizzaLeftOver = (numberOfBoxes * 4) -  guestNumber;   

        }

        if (pizzaType == "Small Money"){

            pizzaLeftOver = (numberOfBoxes * 6) -  guestNumber;   

        }

        if (pizzaType == "Big boys"){

            pizzaLeftOver = (numberOfBoxes * 8) -  guestNumber;   

        }

        if (pizzaType == "Odogwu"){

            pizzaLeftOver = (numberOfBoxes * 12) -  guestNumber;   

        } return pizzaLeftOver;

    }


    public static int PizzaPrice(int guestNumber, String pizzaType){
        int numberOfBoxes = PizzaBoxQuantity(guestNumber, pizzaType);
        int pizzaAmount = 0;
        if (pizzaType == "Sapa size"){

            pizzaAmount = numberOfBoxes * 2500;   

        }

        if (pizzaType == "Small Money"){

            pizzaAmount = numberOfBoxes * 2900;   

        }

        if (pizzaType == "Big boys"){

            pizzaAmount = numberOfBoxes * 4000;   

        }

        if (pizzaType == "Odogwu"){

            pizzaAmount = numberOfBoxes * 5200;   

        } return pizzaAmount;

    }



}
