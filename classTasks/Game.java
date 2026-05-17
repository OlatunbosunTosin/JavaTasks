public class Game{
    public static void main(String[] args){
        
        char[][] ticTac = new char[3][3];
        ticTac[0][0] = 'X'; 
        ticTac[0][1] = 'O';  
        ticTac[0][2] = 'X';  
        ticTac[1][0] = 'O';  
        ticTac[1][1] = 'O';  
        ticTac[1][2] = 'O';  
        ticTac[2][0] = 'X';  
        ticTac[2][1] = 'X';  
        ticTac[2][2] = 'O';  
        

        for(int row = 0; row < ticTac.length; row++){
            for(int column = 0; column < ticTac.length; column++){
                System.out.print(ticTac[row][column]);
            }System.out.println();
        }       
                

    }
}
