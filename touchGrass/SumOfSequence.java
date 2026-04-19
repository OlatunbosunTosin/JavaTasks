public class SumOfSequence{
    public static void main(String[] args){
        int numerator = -1;
        int denominator = 1;
        double sum_of_sequence = 0.0;
        for(;numerator < 99;){
            numerator+=2;
            denominator+=2;
            
            double fraction = (double) numerator / denominator;
            sum_of_sequence += fraction;
     
        }System.out.printf("sum of sequence is %.4f", sum_of_sequence);
    }
}
