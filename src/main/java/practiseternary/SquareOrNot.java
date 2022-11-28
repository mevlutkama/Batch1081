package practiseternary;

import java.util.Scanner;

public class SquareOrNot {
    public static void main(String[] args) {
        //Type java code by using ternary.Take values of length and width of a rectangle from user and check if it is square or not.
        Scanner input =new Scanner(System.in);
        System.out.println("Enter width and length please");
        double w = input.nextDouble();
        double l= input.nextDouble();
        String isSquare = w==l ? "It is square" : "It is not square";
        System.out.println(isSquare);



    }
}
