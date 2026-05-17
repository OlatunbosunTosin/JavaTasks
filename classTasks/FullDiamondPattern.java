public class FullDiamondPattern{
    public static void main(String[] args){
        for(int row = 1; row <= 5; row++){

            for(int space = 5; space >= row; space--){
                System.out.print(" ");
            }

            for(int column = 1; column <= row; column++){
                System.out.print("* ");
            }System.out.println();
        }

        for(int rows = 1; rows <= 4; rows++){

            for(int spaces = 1; spaces <= rows; spaces++){
                System.out.print(" ");
            }

            for(int columns = 4; columns >= rows; columns--){
                System.out.print(" *");
            }System.out.println();
        }

    }
}
