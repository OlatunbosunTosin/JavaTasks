import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFiveTest{

    @Test
    public void testThatElementsInOddIndexAreReturned(){

        int[] number = {1,2,3,4,5};
        int[] expectedOddIndex = TaskFive.oddIndex(number);
        int[] actualOddIndex = {2,4};
        assertArrayEquals(expectedOddIndex, actualOddIndex);


    }

}
