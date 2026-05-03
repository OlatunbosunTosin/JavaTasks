import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SumOfDigitsTest{

    @Test
    public void testThatCorrectSumOfDigitsIsReturned(){

        int expectedSum = SumOfDigits.sumDigits(0);
        int actualSum = 0;
        assertEquals(expectedSum, actualSum);

        int expectedSum1 = SumOfDigits.sumDigits(123);
        int actualSum1 = 6;
        assertEquals(expectedSum1, actualSum1);

        int expectedSum2 = SumOfDigits.sumDigits(999);
        int actualSum2 = 27;
        assertEquals(expectedSum2, actualSum2);

        int expectedSum3 = SumOfDigits.sumDigits(1000);
        int actualSum3 = 1;
        assertEquals(expectedSum3, actualSum3);


    }   

}
