import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskEightTest{

    @Test
    public void testThatCorrectEvenIndexMinimumIsReturned(){

        int[] number = {1,2,3,4,5};
        int expectedMinimum = TaskEight.minimumNumber(number);
        int actualMinimum = 1;
        assertEquals(expectedMinimum, actualMinimum);


    }

}
