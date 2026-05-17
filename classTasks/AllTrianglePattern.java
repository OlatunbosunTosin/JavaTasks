public class AllTrianglePattern{
    public static void main(String[] args){
        int count = 0;
        for(int rows = 1; rows <= 3; rows ++){

            for(int spaces = 1; spaces <= 3; spaces++){
                if (rows == 2 && spaces == 2){
                     System.out.print("1");
                }
                else{
                     System.out.print("2");
                }
                
            }System.out.println();

        }



    }
}
