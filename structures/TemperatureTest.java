import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureTest{

    @Test
    public void testThatCelciusReturnsCorrectConversion(){

        double expectedTemperture = Temperature.celciusToFarenheit(0);
        double actualTemperature = 32.0;
        assertEquals(expectedTemperture, actualTemperature);

        double expectedTemperture2 = Temperature.celciusToFarenheit(100);
        double actualTemperature2 = 212.0;
        assertEquals(expectedTemperture2, actualTemperature2);

        double expectedTemperture3 = Temperature.celciusToFarenheit(-40);
        double actualTemperature3 = -40.0;
        assertEquals(expectedTemperture3, actualTemperature3);


    }   

}
