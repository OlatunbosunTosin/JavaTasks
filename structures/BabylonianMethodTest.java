import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BabylonianMethodTest{

    @Test
    public void testThatBabylonianMethodSquarerootReturnsWithinAValueOfMathSquareRoot(){

        double expectedSquareroot = BabylonianMethodForTest.sqrt(4);
        double actualSquareroot = Math.sqrt(4);
        assertTrue((Math.abs(expectedSquareroot - actualSquareroot)) <= 0.001);

        double expectedSquareroot1 = BabylonianMethodForTest.sqrt(9);
        double actualSquareroot1 = Math.sqrt(9);
        assertTrue((Math.abs(expectedSquareroot1 - actualSquareroot1)) <= 0.001);

        double expectedSquareroot2 = BabylonianMethodForTest.sqrt(16);
        double actualSquareroot2 = Math.sqrt(16);
        assertTrue((Math.abs(expectedSquareroot2 - actualSquareroot2)) <= 0.001);

        double expectedSquareroot3 = BabylonianMethodForTest.sqrt(25);
        double actualSquareroot3 = Math.sqrt(25);
        assertTrue((Math.abs(expectedSquareroot3 - actualSquareroot3)) <= 0.001);

        double expectedSquareroot4 = BabylonianMethodForTest.sqrt(100);
        double actualSquareroot4 = Math.sqrt(100);
        assertTrue((Math.abs(expectedSquareroot4 - actualSquareroot4)) <= 0.001);

        double expectedSquareroot5 = BabylonianMethodForTest.sqrt(144);
        double actualSquareroot5 = Math.sqrt(144);
        assertTrue((Math.abs(expectedSquareroot5 - actualSquareroot5)) <= 0.001);

    }   

}
