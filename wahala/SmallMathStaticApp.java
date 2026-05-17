public class SmallMathStaticApp{

    static double firstNumber;
    static double secondNumber;
    
    public static double getOperatorOf(String operator){
        
        double result = 0;
        
        if (operator.equals("*"))
            result = getMultiplicationOf(firstNumber, secondNumber);
            
        else if (operator.equals("-"))
            result = getSubtractionOf(firstNumber, secondNumber);
            
        else if (operator.equals("+"))
            result = getSumOf(firstNumber, secondNumber);
            
        else if (operator.equals("/"))
            result = getDivisionOf(firstNumber, secondNumber);
 
        return result;
    
    
    }
    
    public static double getMultiplicationOf(double numberOne, double numberTwo){
        
        return numberOne * numberTwo;
    
    }

    
    public static double getSubtractionOf(double numberOne, double numberTwo){
        
        return numberOne - numberTwo;
    
    }
    
        
    public static double getSumOf(double numberOne, double numberTwo){
    
        return numberOne + numberTwo;
    
    }
    
        
    public static double getDivisionOf(double numberOne, double numberTwo){
        if (numberTwo == 0) throw new ArithmeticException("Cannot divide by zero");
            
        return numberOne / numberTwo;
   

    }



}
