import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTenTest{

    @Test
    public void testThatCorrectOddIndexMinimumIsReturned(){

        int[] number = {1,2,3,4,5};
        int expectedMaximum = TaskTen.maximumNumber(number);
        int actualMaximum = 5;
        assertEquals(expectedMaximum, actualMaximum);


    }

}
