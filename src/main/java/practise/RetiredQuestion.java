package practise;

import java.util.Scanner;

public class RetiredQuestion {
    public static void main(String[] args) {
        /*Type java code by using if-else if() statement,
          If age is less than 13 output will be “Should not work”, If age is greater than 65 output will be “Retired”,
Otherwise; output will be “Should work”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age <= 13) {
            System.out.println("Should not work");
        } else if (age < 65) {
            System.out.println("Should work");
        } else if (age >= 65) {
            System.out.println("Retired");
        } else {
            System.out.println("Invalid age");
        }
    }
}
