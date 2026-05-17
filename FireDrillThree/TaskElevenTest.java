import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskElevenTest{

    @Test
    public void testThatCorrectOddIndexMaximumIsReturned(){

        int[] number = {1,2,3,4,5};
        int expectedMaximum = TaskEleven.maximumNumber(number);
        int actualMaximum = 4;
        assertEquals(expectedMaximum, actualMaximum);


    }

}
