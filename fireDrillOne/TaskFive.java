public class TaskFive{
    public static void main(String[] args){
        for(int i = 1; i <= 10; i+=1){
            if(i % 4 == 0){
                for(int counter = 1; counter <= 5; counter++){
                    System.out.print(i);
                }
                System.out.print(" ");
            }
        }
    }
}

