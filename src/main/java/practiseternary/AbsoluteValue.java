package practiseternary;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        //Type java code by using ternary. Write a program to print absolute value of an integer entered by user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer please");
        int i= input.nextInt();
        int abs=i>0 ? i : -1*i;
        System.out.println(abs);
    }
}
