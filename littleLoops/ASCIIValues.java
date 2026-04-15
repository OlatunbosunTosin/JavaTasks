public class ASCIIValues{
    public static void main(String[] args){
        char alphabet = 'A';
        int value = (int) alphabet;
        while (value <= 'Z')
        {
            System.out.printf("%c\t%d%n",alphabet, value);
            value++;  
        }
    }
}
