public class EvenNumber{

    public static void main(String[] args){

        boolean number = isEven(15);
        System.out.print(number);
        

    }

    public static boolean isEven(int n){
        
        boolean even = false;
        if(n % 2 == 0){
        
            even = true;        
        
        }return even;
         
    }

}
