package reviewquestions;

import java.util.Scanner;

public class PasswordQuestion2 {
    public static void main(String[] args) {
        /*Ask user to enter his/her first name, last name and Social Security Number.
        Then type a program which makes
        a) initials of the first name and the last name in uppercase, other characters will be in lowercase.
        b) all characters except last 4 characters of the Social Security Number “ * ”.
        For example; Suleyman Alptekin *****5678*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name, last name and your SSN number please");
        String firstName = input.nextLine();
        String lastName = input.nextLine();
        String ssn = input.next();
        System.out.println(firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase() + " " +
                lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase() + " " +
                ssn.substring(0, 5).replaceAll("[0-9]", "*") + ssn.substring(5));
    }
}
