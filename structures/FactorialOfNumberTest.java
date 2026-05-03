import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialOfNumberTest{

    @Test
    public void testThatCorrectResultForFactorialIsReturned(){

        int expectedFactorial = FactorialOfNumber.factorial(0);
        int actualFactorial = 1;
        assertEquals(expectedFactorial, actualFactorial);

        int expectedFactorial1 = FactorialOfNumber.factorial(1);
        int actualFactorial1 = 1;
        assertEquals(expectedFactorial1, actualFactorial1);

        int expectedFactorial2 = FactorialOfNumber.factorial(5);
        int actualFactorial2 = 120;
        assertEquals(expectedFactorial2, actualFactorial2);

        int expectedFactorial3 = FactorialOfNumber.factorial(6);
        int actualFactorial3 = 720;
        assertEquals(expectedFactorial3, actualFactorial3);


    }   

}
