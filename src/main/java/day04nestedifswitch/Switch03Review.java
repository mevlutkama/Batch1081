package day04nestedifswitch;

import java.util.Scanner;

public class Switch03Review {
    public static void main(String[] args) {
        //Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double firstNumber = input.nextDouble();

        System.out.println("Enter the second number");
        double secondNumber = input.nextDouble();

        System.out.println("Choose an operation among +, -, *, /, %");
        char operation = input.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '%':
                System.out.println(firstNumber * secondNumber / 100);
                break;
            default:
                System.out.println("That operation was not supported by this calculator");
        }
    }
}
