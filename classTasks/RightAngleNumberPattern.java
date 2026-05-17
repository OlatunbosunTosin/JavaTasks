public class RightAngleNumberPattern{
    public static void main(String[] args){
        int count = 0;
        for(int row = 1; row <= 5; row++){
            for(int column = 1; column <= row; column++){
                count++;
                System.out.printf("%2d " , count);
            }System.out.println();
        }

}
}
