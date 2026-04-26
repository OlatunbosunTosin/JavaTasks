public class BackToSender{

    public static int calculateAllowanceOf(int numberOfDelivery){
        int ridersWage = 0;
        if (numberOfDelivery < 50){
            ridersWage = (numberOfDelivery * 160) + 5000;
        }
        
        else if (numberOfDelivery >= 50 && numberOfDelivery <= 59){
            ridersWage = (numberOfDelivery * 200) + 5000;
        }

        else if (numberOfDelivery >= 60 && numberOfDelivery <= 69){
            ridersWage = (numberOfDelivery * 250) + 5000;
        }

        else if (numberOfDelivery >= 70){
            ridersWage = (numberOfDelivery * 500) + 5000;
        }
        return ridersWage;
    }

}
