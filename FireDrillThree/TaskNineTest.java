import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskNineTest{

    @Test
    public void testThatCorrectOddIndexMinimumIsReturned(){

        int[] number = {1,2,3,4,5};
        int expectedMinimum = TaskNine.minimumNumber(number);
        int actualMinimum = 2;
        assertEquals(expectedMinimum, actualMinimum);


    }

}
