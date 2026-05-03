public class PentagonalNumber{

    public static void main(String[] args){

        getPentagonalNumber(100);

    }

    public static int getPentagonalNumber(int n){
        int pentagonalNumber = 0;
        for(int count = 1; count <= n; count++){

            pentagonalNumber = (count * ((3 * count) - 1)) / 2;
            System.out.printf("%7d",pentagonalNumber);

            if (count % 10 == 0){
            
                System.out.println();

            }
            
        }return pentagonalNumber;

    }


}
