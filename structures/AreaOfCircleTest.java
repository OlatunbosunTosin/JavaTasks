import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AreaOfCircleTest{

    @Test
    public void testThatAreaOfCircleIsWithinAValue(){

        double expectedArea = AreaOfCircle.circleArea(1.0);
        double actualArea = 3.14159;
        assertTrue((expectedArea - actualArea) <= 0.001);

        double expectedArea1 = AreaOfCircle.circleArea(5.0);
        double actualArea1 = 78.5398;
        assertTrue((expectedArea1 - actualArea1) <= 0.001);

        double expectedArea2 = AreaOfCircle.circleArea(0.0);
        double actualArea2 = 0.0;
        assertTrue((expectedArea2 - actualArea2) <= 0.001);


    }   

}
