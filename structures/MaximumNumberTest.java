import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximumNumberTest{

    @Test
    public void testThatCorrectMaximumNumberIsReturned(){

        int expectedNumber = MaximumNumber.max(1,2,3);
        int actualNumber = 3;
        assertEquals(expectedNumber, actualNumber);

        int expectedNumber1 = MaximumNumber.max(3,2,1);
        int actualNumber1 = 3;
        assertEquals(expectedNumber1, actualNumber1);

        int expectedNumber2 = MaximumNumber.max(2,2,2);
        int actualNumber2 = 2;
        assertEquals(expectedNumber, actualNumber);

        int expectedNumber3 = MaximumNumber.max(-1,-2,-3);
        int actualNumber3 = -1;
        assertEquals(expectedNumber3, actualNumber3);



    }   

}
