package reviewquestions;

import java.util.Scanner;

public class Question03 {
    public static void main(String[] args) {
        /*Ask user to enter his/her first and last name. If the first name is longer output will be “First name is longer.
        ”If the length of first name is equal To the length of last name output will be “First name and last name
        have same length.” Otherwise, output will be “Last name is longer”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name please");
        String firstName = input.nextLine();
        String lastName = input.nextLine();

        String res = firstName.length() == lastName.length() ? ("First name and last name have same length") : (firstName.length() > lastName.length() ? "First name is longer" : "Last name is longer");
        System.out.println(res);

        if (firstName.length() > lastName.length()) {
            System.out.println("First name is longer");
        } else if (lastName.length() == firstName.length()) {
            System.out.println("First name and last name have same length");
        } else {
            System.out.println("Last name is longer");
        }
    }
}
