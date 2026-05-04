import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskSevenTest{

    @Test
    public void testThatCorrectSumOfOddIndexIsReturned(){

        int[] number = {1,2,3,4,5};
        int expectedSum = TaskSeven.oddIndexSum(number);
        int actualSum = 6;
        assertEquals(expectedSum, actualSum);


    }

}
