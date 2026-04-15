public class TaskSix{
    public static void main(String[] args){
        int multiples;
        for(int i = 1; i <= 10; i+=1){
            if(i % 4 == 0)
            for(int counter = 1; counter <= 5; counter++){
                    System.out.print((int) Math.pow(i, counter) + " ");
            }
        }
        System.out.println();
    }
}
