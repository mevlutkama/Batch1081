package practiseternary;

import java.util.Scanner;

public class OddEvenQuestion {
    public static void main(String[] args) {
        /*Type java code by using ternary and if-else, ask user to enter an integer, if the integer is even,
the output will be “The integer is even”. If the integer is odd, the output will be “The integer is odd”.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer please");
        int i = input.nextInt();
        String res = i % 2 == 0 ? "The integer is even" : "The integer is odd";
        System.out.println(res);

        if (i % 2 == 0) {
            System.out.println("The integer is even");
        } else {
            System.out.println("The integer is odd");
        }
    }
}
