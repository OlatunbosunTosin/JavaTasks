import java.util.Scanner;
public class CheckOutApp{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("What is customer's name: ");
        String customerName = input.nextLine();
        
        String[] product = new String[5]; 
        int[] quantity = new int[5];
        double[] amount = new double[5];
        double [] total = new double[5];

        int count = 0;
        int index = 0;
        double subTotal = 0.0;
        double discountedPrice = 0.0;
        double vat = 0.0;
        double billTotal = 0.0;
        double amountPaid = 0.0;
        double balance = 0.0;


        while(true){ 

            System.out.print("What did the user buy? ");
            product[count] = input.next();

            System.out.print("How many pieces? ");
            quantity[count] = input.nextInt();

            System.out.print("How much per unit? ");
            amount[count] = input.nextDouble();
            count++;

            System.out.print("Add more items? ");
            String purchase = input.next();

            if (!purchase.equalsIgnoreCase("yes")){
                break;
            }
        }
        System.out.print("What is your name: ");
        String cashierName = input.next();

        System.out.print("How much discount will he get? ");
        int discount = input.nextInt();



        System.out.printf("%10s%5s%10s%15s%n" , "ITEM" , "QTY", "PRICE", "TOTAL(NGN)");
        for(;index < product.length; index++){
            total[index] = quantity[index] * amount[index];
            subTotal += total[index];
            discountedPrice = (discount / 100.0) * subTotal;
            
            System.out.printf("%10s%5d%10.2f%15.2f%n" , product[index] , quantity[index], amount[index], total[index]);
            
        }
        vat = (17.5 / 100) * subTotal;
        billTotal = subTotal - discountedPrice + vat;


        System.out.println();
        System.out.printf("----------------------------------------%n");
        System.out.printf("%25s%15.2f%n%25s%15.2f%n%25s%15.2f%n", "Sub Total:", subTotal, "Discount:", discountedPrice, "VAT @ 17.50:", vat);
        System.out.printf("----------------------------------------%n");
        System.out.printf("----------------------------------------%n");
        System.out.printf("%25s%15.2f%n", "Bill Total:", billTotal);
        System.out.printf("----------------------------------------%n");
        System.out.printf("----------------------------------------%n");

        System.out.print("How much did customer give to you? ");
        amountPaid = input.nextDouble();
    
        balance = amountPaid - billTotal;

        System.out.printf("%25s%15.2f%n%25s%15.2f%n", "Amount Paid:", amountPaid, "Balance:", balance);

    }

}
