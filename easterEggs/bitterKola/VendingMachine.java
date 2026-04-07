import java.util.Scanner;
public class VendingMachine{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a product code from 1 - 4: ");
        int productCode = input.nextInt();
        System.out.printf("Enter amount tendered: ");
        int amountTendered = input.nextInt();
        int waterChange = amountTendered - 100;
        int juiceChange = amountTendered - 200;
        int sodaChange = amountTendered - 150;
        int snackChange = amountTendered - 300;

        if (productCode == 1){
            if (waterChange >= 0){
                System.out.printf("Your change is %d%n", waterChange);
            }
            else {
                System.out.printf("Amount is insufficient%n");
            }
        }
        else if (productCode == 2){
            if (juiceChange >= 0){
                System.out.printf("Your change is %d%n", juiceChange);
            }
            else {
                System.out.printf("Amount is insufficient%n");
            }
        }
        else if (productCode == 3){
            if (sodaChange >= 0){
                System.out.printf("Your change is %d%n", sodaChange);
            }
            else {
                System.out.printf("Amount is insufficient%n");
            }
        }
        else if (productCode == 4){
            if (snackChange >= 0){
                System.out.printf("Your change is %d%n", snackChange);
            }
            else {
                System.out.printf("Amount is insufficient%n");
            }
        }
    }
}
