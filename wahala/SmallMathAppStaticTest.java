import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SmallMathAppStaticTest{


    @Test
    public void testForMultiplicationOperation(){
   
        SmallMathStaticApp.firstNumber = 10;
        SmallMathStaticApp.secondNumber = 5;
        double expectedProduct = SmallMathStaticApp.getOperatorOf("*");
        double actualProduct = 50.0;
        assertEquals(expectedProduct, actualProduct);
    
    }


    @Test
    public void testForSubtractionOperation(){
    
        SmallMathStaticApp.firstNumber = 10;
        SmallMathStaticApp.secondNumber = 5;
        double expectedDifference = SmallMathStaticApp.getOperatorOf("-");
        double actualDifference = 5.0;
        assertEquals(expectedDifference, actualDifference);
    
    }
    
    @Test
    public void testForAdditionOperation(){
    
        SmallMathStaticApp.firstNumber = 10;
        SmallMathStaticApp.secondNumber = 5;
        double expectedSum = SmallMathStaticApp.getOperatorOf("+");
        double actualSum = 15.0;
        assertEquals(expectedSum, actualSum);
    
    }
    
    @Test
    public void testForDivisionOperation(){
    
        SmallMathStaticApp.firstNumber = 10;
        SmallMathStaticApp.secondNumber = 5;
        double expectedQuotient = SmallMathStaticApp.getOperatorOf("/");
        double actualQuotient = 2.0;
        assertEquals(expectedQuotient, actualQuotient);
    
    }
    
    @Test
    public void testForDivisionByZero(){
    
        SmallMathStaticApp.firstNumber = 10;
        SmallMathStaticApp.secondNumber = 0;

        assertThrows(ArithmeticException.class, () -> SmallMathStaticApp.getOperatorOf("/"));
    
    }


}
