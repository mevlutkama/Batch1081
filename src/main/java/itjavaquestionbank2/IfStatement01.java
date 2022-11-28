package itjavaquestionbank2;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        /*Type code to print    a) "Winter" for December, January, February
                                b) "Spring" for March, April, May
                                c) "Summer" for June, July, August
                                d) "Fall" for September, October, November
                                e) "Invalid month name" for all the others*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter month name");
        String mn = scan.next().toLowerCase();

        if (mn.equals("december") || mn.equals("january") || mn.equals("february")) {
            System.out.println("WINTER");
        } else if (mn.equals("march") || mn.equals("april") || mn.equals("may")) {
            System.out.println("SPRING");
        } else if (mn.equals("june") || mn.equals("july") || mn.equals("august")) {
            System.out.println("SUMMER");
        } else if (mn.equals("september") || mn.equals("october") || mn.equals("november")) {
            System.out.println("FALL");
        } else {
            System.out.println("Invalid month name");
        }

        /*) Type code to print  a) "Valid Password" if the password has at least 8 characters different from space character
                                b) "Do not use space character in password" if the password has any space character in any position
                                c) "Invalid Password" if a and b conditions are not satisfied
                                Note: Be careful about the orders of conditions in the solution*/
        String pwd = "km6476";
        if (pwd.replaceAll("\\S", "").length() > 0) {
            System.out.println("Do not use space character in password");
        } else if (pwd.replaceAll("\\s", "").length() > 7) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }

        /*Type code to print    a) "Round up by last digit:" and print the rounded value if the last digit is greater than
 or equal to 5                  b) "Round down by last digit" and print the rounded value if the last digit is less than 5*/

        int i = 158;
        if (i % 10 >= 5) {
            System.out.println("Round up by last digit: " + (i / 10 + 1) * 10);
        } else {
            System.out.println("Round down by last digit: " + (i / 10) * 10);
        }
    }
}
