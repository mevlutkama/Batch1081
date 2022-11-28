package slides1;

import java.util.Scanner;

public class MulTableFactoriel {
    public static void main(String[] args) {
        /*  Type java code by using while loop, Write a program that prompts the user to input a positive integer.
        It should then print the multiplication table of that number.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer to make a multiplication table");
        int a = input.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.print(a + "x" + i + "=" + a * i + " ");
            i++;
        }
        System.out.println();
         /*)Type java code by using while loop, Write a program that prompts the user to input a positive integer.
It should then print factorial of that number.*/
        int fact = 1;
        int j = 1;
        while (j <= a) {
            fact = fact * j;
            j++;
        }
        System.out.println(fact);
    }
}
