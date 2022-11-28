package practise;

import java.util.Scanner;

public class PasswordQuestion {
    public static void main(String[] args) {
        /*Type java code by using if-else statement,if the password is “JavaLearner”, output will be “The password is true”.
        Otherwise, output will be “The password is false”.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your password please");
        String password = input.next();
        if (password.equals("JavaLearner")) {
            System.out.println("The password is true");
        } else {
            System.out.println("The password is false");
        }
    }
}
