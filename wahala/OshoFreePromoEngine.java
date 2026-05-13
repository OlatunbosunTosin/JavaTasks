public class OshoFreePromoEngine{

    public static double getDiscountOf(double cartTotal, String promoCode){
    
        double discount = 0.0;
        double finalPrice = 0.0;
        
        if (cartTotal < 5000 ){
        
            finalPrice = cartTotal;
            
        }
        
        else if (cartTotal >= 5000.00 && cartTotal <= 14999.00 && promoCode.equals("STARTER10")){
        
            discount = (10.0 / 100.0) * cartTotal;
            finalPrice = cartTotal - discount;
        
        }
        
        else if (cartTotal > 14999.00 && cartTotal <= 29999 && promoCode.equals("BIGBOY20")){
        
            discount = (20.0 / 100.0) * cartTotal;
            finalPrice = cartTotal - discount;
        
        }
        
        else if (cartTotal > 29999.00 && promoCode.equals("OSHOFREE35")){
        
            discount = (35.0 / 100.0) * cartTotal;
            finalPrice = cartTotal - discount;
        
        }
        else
            finalPrice = cartTotal;
            
        return finalPrice;
    
    
    }


}
