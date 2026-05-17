import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RangeOfNumbersTest{

    @Test
    public void testThatCorrectRangeOfNumbersIsOutputted(){

        int[] numbers = {2,5,7,9,20};
        int expectedRange = 18;
        int actualRange = RangeOfNumbers.getRangeOf(numbers);
        assertEquals(actualRange, expectedRange);


        int[] integers = {2,3,1,4,6};
        int expectedRangeTwo = 5;
        int actualRangeTwo = RangeOfNumbers.getRangeOf(integers);
        assertEquals(actualRangeTwo, expectedRangeTwo);

    }




}        

