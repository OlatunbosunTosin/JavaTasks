public class EvenTasks{
    public static void main(String[] args){
        int number = 100;
        while(number >= 1){


            if (number % 2 == 0 && number % 4 == 0){
                System.out.printf("%d - Even, Hurray!!!%n", number);   
            }
            else if (number % 2 == 0){
                System.out.printf("%d - Even%n", number);   
            }
            else if (number % 2 != 0){
                System.out.printf("%d - Odd%n", number);   
            }
            number--;
        }
    }
}
