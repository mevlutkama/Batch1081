package practise;

import java.util.Scanner;

public class DaynameQuestion {
    public static void main(String[] args) {
        /* Example 29: Ask user ta enter any name of the week, then get second ,fourth, and sixth letter of the day name
                    and print them on the console, in the same line.
                    For example; if the user enters “Monday” output will be “ody”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a dayname please");
        String dayName = input.next();
        System.out.print(dayName.charAt(1));
        System.out.print(dayName.charAt(3));
        System.out.print(dayName.charAt(5));
    }
}

