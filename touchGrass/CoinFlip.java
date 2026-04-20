import java.util.Random;
public class CoinFlip{
    public static void main(String[] args){
        Random generator = new Random();
        int head = 0;
        int tail = 0;
        for (int number = 1; number <= 1000000; number++){
            int coin = generator.nextInt(2);
            if (coin == 0){
                head++;
            }
            else {
                tail++;
            }
        
        }
                                                                                                                                    
        System.out.printf("Head appears %d times and tail appears %d times", head, tail);

    }
}
