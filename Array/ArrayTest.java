import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayTest{

    @Test 
    public void testThatLargestNumberOfArrayIsReturned(){

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int expectedHighest = 9;
        int actualHighest = Arrays.LargestNumberOf(numbers);
        assertEquals(expectedHighest, actualHighest);

    }

    @Test
    public void testThatReverseOfArrayIsReturned(){

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] expected = {9,8,7,6,5,4,3,2,1};
        int[] actual = Arrays.ReverseNumberOf(numbers);
        assertArrayEquals(expected, actual);

    }

    @Test
    public void testThatAnElementOccursInArray(){

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int element = 5;
        boolean elementPresentIn = Arrays.elementPresentIn(numbers, element);
        assertTrue(elementPresentIn);

    }
    
    @Test
    public void testThatPrintElementsInOddPositionInArray(){

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int[] expected = {1,3,5,7,9};
        int[] actual = Arrays.OddPositionElements(numbers);
        assertArrayEquals(expected, actual);

    }












}
