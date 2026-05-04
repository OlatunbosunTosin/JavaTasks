import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFourTest{

    @Test
    public void testThatElementsInEvenIndexAreReturned(){

        int[] number = {1,2,3,4,5};
        int[] expectedEvenIndex = TaskFour.evenIndex(number);
        int[] actualEvenIndex = {1,3,5};
        assertArrayEquals(expectedEvenIndex, actualEvenIndex);


    }

}
