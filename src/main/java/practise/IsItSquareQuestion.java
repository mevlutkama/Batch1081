package practise;

import java.util.Scanner;

public class IsItSquareQuestion {
    public static void main(String[] args) {
        /*Example 25: Ask user to enter the values of length and width of a rectangle, then check if it is square or not.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length and width please");
        double l = input.nextDouble();
        double w = input.nextDouble();
        if (l == w) {
            System.out.println("It is square");
        }
        if (l != w) {
            System.out.println("It is not square");
        }

        /*Example 26: Ask user to enter his/her age. If the age is between 18 and 65 then output will be “You should work”,
                    else output will be “No need to work”*/
        System.out.println("Enter your age please");
        int age=input.nextInt();
        if (age>=18 && age<=65){
            System.out.println("You should work");
        }else {
            System.out.println("No need to work");
        }
    }
}
