package itjavaquestionbank2;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {
        /*Type code to create a simple calculator which does addition, subtraction, multiplication, and division with any 2 number
 a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the console
 b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the console
 c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the console
 d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the console*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers please");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        System.out.println("Choose an operation among +, -, *, / please");
        char operation = scan.next().charAt(0);
        if (operation == '+') {
            System.out.println(num1 + num2);
        } else if (operation == '-') {
            System.out.println(num1 - num2);
        } else if (operation == '*') {
            System.out.println(num1 * num2);
        } else if (operation == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operation");
        }
    }
}
