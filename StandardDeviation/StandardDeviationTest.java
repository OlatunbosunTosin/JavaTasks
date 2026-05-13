import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void testForCorrectMeanOfNumber(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedMean = StandardDeviation.getMeanOf(numbers);
        double actualMean = 3.0;
        assertEquals(expectedMean, actualMean);  
        
            
        double[] number2 = {2,4.5,7.5,5,9,10,5};
        double expectedMean2 = StandardDeviation.getMeanOf(number2);
        double actualMean2 = 6.1429;
        assertEquals(expectedMean2, actualMean2); 
    
    }
    
    @Test
    public void testForCorrectSumOfMeanDeviationOfNumber(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedMeanDEviation = StandardDeviation.getMeanDeviationOf(numbers);
        double actualMeanDEviation = 10.0;
        assertEquals(expectedMeanDEviation, actualMeanDEviation);  
        
        double[] number2 = {2,4.5,7.5,5,9,10,5};
        double expectedMeanDEviation2 = StandardDeviation.getMeanDeviationOf(number2);
        double actualMeanDEviation2 = 47.3571;
        assertEquals(expectedMeanDEviation2, actualMeanDEviation2);  
    
    }
    
    @Test
    public void testForCorrectVarianceOfNumber(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedVariance = StandardDeviation.getVarianceOf(numbers);
        double actualVariance = 2.0;
        assertEquals(expectedVariance, actualVariance);  
            
        double[] number2 = {2,4.5,7.5,5,9,10,5};
        double expectedVariance2 = StandardDeviation.getVarianceOf(number2);
        double actualVariance2 = 6.7653;
        assertEquals(expectedVariance2, actualVariance2); 
  
    }
    
    @Test
    public void testForCorrectStandardDeviationOfNumber(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedStandardDeviation = StandardDeviation.getStandardDeviationOf(numbers);
        double actualStandardDeviation = 1.4142;
        assertEquals(expectedStandardDeviation, actualStandardDeviation); 
        
        double[] number2 = {2,4.5,7.5,5,9,10,};
        double expectedStandardDeviation2 = StandardDeviation.getStandardDeviationOf(number2);
        double actualStandardDeviation2 = 2.7639;
        assertEquals(expectedStandardDeviation2, actualStandardDeviation2);   
  
    }

}
