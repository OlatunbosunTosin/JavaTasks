public class StandardDeviation{

    public static double getMeanOf(double[] numbers){
    
        double sum = 0.0;
        double mean = 0.0;
        for(double number : numbers){
        
            sum += number;
            
        }mean = sum / numbers.length;
        
        return Math.round(mean * 10000.0) / 10000.0;
    
    
    }

    public static double getMeanDeviationOf(double[] numbers){
    
        double mean = getMeanOf(numbers);
        double meanDeviation = 0.0;
        double sumOfMeanDeviation = 0.0;
       
        for(double number : numbers){
            
            meanDeviation = Math.pow((number - mean), 2);
            sumOfMeanDeviation += meanDeviation;
        
        }
       
        return Math.round(sumOfMeanDeviation * 10000.0) / 10000.0;
    
    }
    
    public static double getVarianceOf(double[] numbers){
    
        double sumOfMeanDeviation = getMeanDeviationOf(numbers);
        
        double variance = sumOfMeanDeviation / numbers.length;
        
       
        return Math.round(variance * 10000.0) / 10000.0;
    
    }
    
    public static double getStandardDeviationOf(double[] numbers){
    
        double variance = getVarianceOf(numbers);
        
        double standardDeviation = Math.sqrt(variance);
       
        return Math.round(standardDeviation * 10000.0) / 10000.0;
    
    }



}
