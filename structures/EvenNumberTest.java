import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenNumberTest{

    @Test
    public void testThatCorrectResponseForEvenNumber(){

        boolean even = EvenNumber.isEven(4);
        assertTrue(even);

        boolean even1 = EvenNumber.isEven(7);
        assertFalse(even1);

        boolean even2 = EvenNumber.isEven(0);
        assertTrue(even2);

        boolean even3 = EvenNumber.isEven(-2);
        assertTrue(even3);


    }   

}
