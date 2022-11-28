package practiseternary;

import java.util.Scanner;

public class DigitQuestion {
    public static void main(String[] args) {
        /*Ask user to enter an integer. If the number has 3 digits, output will be “This number has 3 digits.”
        Otherwise, output will be “This number has no 3 digits.” How can you decide the number of digits of an integer?*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer please");
        int i = input.nextInt();
        String hasThreeDigits = i > 99 && i < 1000 ? "This number has 3 digits " : "This number has no 3 digits";
        System.out.println(hasThreeDigits);
    }
}
