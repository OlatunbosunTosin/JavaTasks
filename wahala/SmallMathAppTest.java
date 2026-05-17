import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmallMathAppTest{

    SmallMathApp arithmeticOperator = new SmallMathApp(); 

    @Test
    public void testForMultiplicationOperation(){
    
        double expectedProduct = arithmeticOperator.getOperatorOf("*");
        double actualProduct = 50.0;
        assertEquals(expectedProduct, actualProduct);
    
    }


    @Test
    public void testForSubtractionOperation(){
    
        double expectedDifference = arithmeticOperator.getOperatorOf("-");
        double actualDifference = 5.0;
        assertEquals(expectedDifference, actualDifference);
    
    }
    
    @Test
    public void testForAdditionOperation(){
    
        double expectedSum = arithmeticOperator.getOperatorOf("+");
        double actualSum = 15.0;
        assertEquals(expectedSum, actualSum);
    
    }
    
    @Test
    public void testForDivisionOperation(){
    
        double expectedQuotient = arithmeticOperator.getOperatorOf("/");
        double actualQuotient = 2.0;
        assertEquals(expectedQuotient, actualQuotient);
    
    }
    
/*    @Test
    public void testForDivisionByZero(){
    
        double expectedQuotient = SmallMathApp.getDivisionOf("/",8,4);
        double actualQuotient = 2.0;
        assertEquals(expectedQuotient, actualQuotient);
    
    }*/


}
