import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskSixTest{

    @Test
    public void testThatCorrectSumOfEvenIndexIsReturned(){

        int[] number = {1,2,3,4,5};
        int expectedSum = TaskSix.evenIndexSum(number);
        int actualSum = 9;
        assertEquals(expectedSum, actualSum);


    }

}
