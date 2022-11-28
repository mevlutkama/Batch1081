package practiseternary;

import java.util.Scanner;

public class MinimumOneQuestion {
    public static void main(String[] args) {
        /*Type java code by using ternary and if-else. Ask user to enter two integers Write a program to print the
        minimum one on the console.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers please");
        int a = input.nextInt();
        int b = input.nextInt();
        int min = a > b ? b : a;
        System.out.println(min);

        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
