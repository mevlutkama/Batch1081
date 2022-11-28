package practise;

import java.util.Scanner;

public class SumOrMultiplicationOfTwoIntegers {
    public static void main(String[] args) {
       /* Type java code by using if-else if() statement,
        if both of the two integers are positive, output will be the sum of them.
        If both of the two integers are negative, output will be the multiplication of them.
        Otherwise; output will be “I cannot add or multiply different signed numbers”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first integer");
        int firstNum = input.nextInt();

        System.out.println("Enter second integer");
        int secondNum = input.nextInt();

        if (firstNum > 0 && secondNum > 0) {
            System.out.println(firstNum + secondNum);
        } else if (firstNum < 0 && secondNum < 0) {
            System.out.println(firstNum * secondNum);
        } else {
            System.out.println("I cannot add or multiply different signed numbers");
        }
    }
}
