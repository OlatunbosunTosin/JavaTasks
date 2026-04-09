public class ProductOfIntegers{
    public static void main(String[] args){
        
        int product = 1;
        for (int i = 1; i <= 10; i+=1)
        {
            product *= i;
            
        }
        System.out.printf("Product of Integers between 1 and 10 = %d%n", product);

}
}
