import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackToSenderTest{

    @Test
    public void testThatTheRightAllowanceIsReturnedForDeliveryLessThan50(){
        
        int successfulDelivery = 45;

        int expectedAllowance = BackToSender.calculateAllowanceOf(successfulDelivery);

        int actualAllowance = 12200;
        assertEquals(actualAllowance, expectedAllowance);

    }

    @Test
    public void testThatTheRightAllowanceIsReturnedForDeliveryBetween50And59(){
        
        int successfulDelivery = 55;

        int expectedAllowance = BackToSender.calculateAllowanceOf(successfulDelivery);

        int actualAllowance = 16000;
        assertEquals(actualAllowance, expectedAllowance);

    }

    @Test
    public void testThatTheRightAllowanceIsReturnedForDeliveryBetween60And69(){
        
        int successfulDelivery = 65;

        int expectedAllowance = BackToSender.calculateAllowanceOf(successfulDelivery);

        int actualAllowance = 21250;
        assertEquals(actualAllowance, expectedAllowance);

    }

    @Test
    public void testThatTheRightAllowanceIsReturnedForDeliveryFrom70(){
        
        int successfulDelivery = 80;

        int expectedAllowance = BackToSender.calculateAllowanceOf(successfulDelivery);

        int actualAllowance = 45000;
        assertEquals(actualAllowance, expectedAllowance);

    }


}
