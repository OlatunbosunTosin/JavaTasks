public class TaskNine{
    public static void main(String[] args){
        int multiples;
        int sum = 0;
        for(int i = 1; i <= 10; i+=1){
            
            if(i % 4 == 0)
            
            for(int counter = 1; counter <= 5; counter++){ 
                   
                    sum += (int) Math.pow(i, counter);
                    
                     
            }
            
        }System.out.print(sum * sum);
       
    }
}
