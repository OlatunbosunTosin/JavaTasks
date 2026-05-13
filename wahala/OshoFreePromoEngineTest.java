import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OshoFreePromoEngineTest{

    @Test
    public void testForDiscountOfZeroPercent(){
    
        double expectedDiscountedPrice = OshoFreePromoEngine.getDiscountOf(4000.00, "STARTER10");
        double actualDiscountedPrice = 4000.00;
        assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
    
    }
    
    
    @Test
    public void testForDiscountOfTenPercent(){
    
        double expectedDiscountedPrice = OshoFreePromoEngine.getDiscountOf(6000.00, "STARTER10");
        double actualDiscountedPrice = 5400.00;
        assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
    
    }
    
    
    @Test
    public void testForDiscountOfTwentyPercent(){
    
        double expectedDiscountedPrice = OshoFreePromoEngine.getDiscountOf(18000.00, "BIGBOY20");
        double actualDiscountedPrice = 14400.00;
        assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
    
    }
    
    
    @Test
    public void testForDiscountOfThirtyFivePercent(){
    
        double expectedDiscountedPrice = OshoFreePromoEngine.getDiscountOf(40000.00, "OSHOFREE35");
        double actualDiscountedPrice = 26000.00;
        assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
    
    }
    
        @Test
    public void testForInvalidPromoCode(){
    
        double expectedDiscountedPrice = OshoFreePromoEngine.getDiscountOf(18000.00, "FAKE99");
        double actualDiscountedPrice = 18000.00;
        assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
        
        double expectedDiscountedPrice2 = OshoFreePromoEngine.getDiscountOf(50000.00, "STARTER10");
        double actualDiscountedPrice2 = 50000.00;
        assertEquals(expectedDiscountedPrice2, actualDiscountedPrice2);
    
    }
    
        @Test
    public void testForCartTotalOfFiveThousand(){
    
        double expectedDiscountedPrice = OshoFreePromoEngine.getDiscountOf(5000.00, "STARTER10");
        double actualDiscountedPrice = 4500.00;
        assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
    
    }
    
        @Test
    public void testForCartTotalOfFifteenThousand(){
    
        double expectedDiscountedPrice = OshoFreePromoEngine.getDiscountOf(15000.00, "BIGBOY20");
        double actualDiscountedPrice = 12000.00;
        assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
    
    }
    
        @Test
    public void testForCartTotalOfThirtyThousand(){
    
        double expectedDiscountedPrice = OshoFreePromoEngine.getDiscountOf(30000.00, "OSHOFREE35");
        double actualDiscountedPrice = 19500.00;
        assertEquals(expectedDiscountedPrice, actualDiscountedPrice);
    
    }
    
        @Test
    public void testForInvalidAmount(){

        assertThrows(IllegalArgumentException.class, () -> OshoFreePromoEngine.getDiscountOf(-2000.00, "OSHOFREE35"));
    }

}
