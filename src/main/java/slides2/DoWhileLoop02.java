package slides2;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*Ask user to enter a number. If the number is divisible by 10 then print "Won!" on the console otherwise ask user to enter another number.
Use do-while loop.*/
        Scanner scan = new Scanner(System.in);
        int counter = 0;

        do {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if (counter == 2) {
                System.out.println("LOST");
                break;
            }
            if (num % 10 == 0) {
                System.out.println("WON");
                break;
            }
            counter++;
        } while (counter < 3);
    }
}
