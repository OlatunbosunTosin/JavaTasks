import java.util.Scanner;
public class DiscountPrice{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Initial price: ");
        double initialPrice = input.nextDouble();
        System.out.printf("Enter discount percentage: ");
        double discountPercentage = input.nextDouble();
        double discountAmount = (discountPercentage / 100) * initialPrice;
        double finalPrice = initialPrice - discountAmount;

        System.out.printf("Your final price after %.2f percent discount is %.2f%n", discountPercentage, finalPrice);
}
}
