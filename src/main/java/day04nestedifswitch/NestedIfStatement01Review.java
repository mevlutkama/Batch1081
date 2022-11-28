package day04nestedifswitch;

import java.util.Scanner;

public class NestedIfStatement01Review {
    public static void main(String[] args) {
        /*      Ask user to enter a password

		        If the initial of the password is uppercase then check if it is ‘A’ or not.
		If it is ‘A’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

		        If the initial of the password is lowercase then check if it is ‘z’ or not.
		If it is ‘z’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter password");
        char initialOfPwd = input.next().charAt(0);
        if (initialOfPwd >= 'A' && initialOfPwd <= 'Z') {
            if (initialOfPwd == 'A') {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        } else if (initialOfPwd >= 'a' && initialOfPwd <= 'z') {
            if (initialOfPwd == 'z') {
                System.out.println("Valid password");
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid password");
        }
    }
}
