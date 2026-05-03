import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeNumberTest{

    @Test
    public void testThatCorrectResponseForPrimeNumberIsReturned(){

        boolean prime = PrimeNumber.isPrime(2);
        assertTrue(prime);

        boolean prime1 = PrimeNumber.isPrime(1);
        assertFalse(prime1);

        boolean prime2 = PrimeNumber.isPrime(17);
        assertTrue(prime2);

        boolean prime3 = PrimeNumber.isPrime(4);
        assertFalse(prime3);

        boolean prime4 = PrimeNumber.isPrime(0);
        assertFalse(prime4);


    }   

}
