package practise;

import java.util.Scanner;

public class DiscountQuestion {
    public static void main(String[] args) {
        /*Type java code by using if-else statement. A shop will give discount of 10% if the cost of purchased quantity is
        more than 1000. Ask user for quantity and unit price then judge and print total cost for user.
        If the quantity is less than 1000 output will be “No discount.”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Purchased Quantity Please");
        double purchasedQuantity = input.nextDouble();
        double afterDiscount = purchasedQuantity - (purchasedQuantity / 10);
        if (purchasedQuantity >= 1000) {
            System.out.println("Discount you will pay: " + afterDiscount);
        } else {
            System.out.println("No Discount");
        }
    }
}
