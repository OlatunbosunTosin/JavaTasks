public class SmallMathApp{

    double firstNumber = 10;
    double secondNumber = 5;
    
    public double getOperatorOf(String operator){
        
        double result = 0;
        
        if (operator.equals("*"))
            result = getMultiplicationOf(firstNumber, secondNumber);
            
        if (operator.equals("-"))
            result = getSubtractionOf(firstNumber, secondNumber);
            
        if (operator.equals("+"))
            result = getSumOf(firstNumber, secondNumber);
            
        if (operator.equals("/"))
            result = getDivisionOf(firstNumber, secondNumber);
            
        return result;
    
    
    }
    
    public double getMultiplicationOf(double numberOne, double numberTwo){
        
        return numberOne * numberTwo;
    
    }

    
    public double getSubtractionOf(double numberOne, double numberTwo){
        
        return numberOne - numberTwo;
    
    }
    
        
    public double getSumOf(double numberOne, double numberTwo){
    
        return numberOne + numberTwo;
    
    }
    
        
    public double getDivisionOf(double numberOne, double numberTwo){
        
        return numberOne / numberTwo;
   

    }



}
