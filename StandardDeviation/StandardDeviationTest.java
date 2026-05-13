import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest{

    @Test
    public void testForCorrectMeanOfNumber(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedMean = StandardDeviation.getMeanOf(numbers);
        double actualMean = 3.0;
        assertEquals(expectedMean, actualMean);  
        
            
        double[] scores = {2,4.5,7.5,5,9,10,5};
        double expectedMeanScore = StandardDeviation.getMeanOf(scores);
        double actualMeanScore = 6.1429;
        assertEquals(expectedMeanScore, actualMeanScore); 
    
    }
    
    @Test
    public void testForCorrectSumOfMeanDeviationOfNumber(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedMeanDeviation = StandardDeviation.getMeanDeviationOf(numbers);
        double actualMeanDeviation = 10.0;
        assertEquals(expectedMeanDeviation, actualMeanDeviation);  
        
        double[] scores = {2,4.5,7.5,5,9,10,5};
        double expectedMeanDeviationScore = StandardDeviation.getMeanDeviationOf(scores);
        double actualMeanDeviationScore = 47.3571;
        assertEquals(expectedMeanDeviationScore, actualMeanDeviationScore);  
    
    }
    
    @Test
    public void testForCorrectVarianceOfNumber(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedVariance = StandardDeviation.getVarianceOf(numbers);
        double actualVariance = 2.0;
        assertEquals(expectedVariance, actualVariance);  
            
        double[] scores = {2,4.5,7.5,5,9,10,5};
        double expectedVarianceScore = StandardDeviation.getVarianceOf(scores);
        double actualVarianceScore = 6.7653;
        assertEquals(expectedVarianceScore, actualVarianceScore); 
  
    }
    
    @Test
    public void testForCorrectStandardDeviationOfNumber(){
    
        double[] numbers = {1,2,3,4,5};
        double expectedStandardDeviation = StandardDeviation.getStandardDeviationOf(numbers);
        double actualStandardDeviation = 1.4142;
        assertEquals(expectedStandardDeviation, actualStandardDeviation); 
        
        double[] scores = {2,4.5,7.5,5,9,10,};
        double expectedStandardDeviationScore = StandardDeviation.getStandardDeviationOf(scores);
        double actualStandardDeviationScore = 2.7639;
        assertEquals(expectedStandardDeviationScore, actualStandardDeviationScore);   
  
    }

}
