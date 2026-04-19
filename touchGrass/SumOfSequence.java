public class SumOfSequence{
    public static void main(String[] args){
        int numerator = -1;
        int denominator = 1;
        double sumOfSequence = 0.0;
        for(;numerator < 99;){
            numerator+=2;
            denominator+=2;
            
            double fraction = (double) numerator / denominator;
            sumOfSequence += fraction;
     
        }System.out.printf("sum of sequence is %.4f", sumOfSequence);
    }
}
