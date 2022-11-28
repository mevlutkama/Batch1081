package practisesession01;

import java.util.Scanner;

public class Q04StringManipulations {
    public static void main(String[] args) {
        String str = "Tom Hanks";
        String reversed = "";
        for (int i = str.length() - 1; i > -1; i--) {
            String s = str.substring(i, i + 1);
            reversed = reversed + s;
        }
        System.out.print(reversed);

        System.out.println();

        String fullName = "   Tom Hanks   ";
        fullName = fullName.trim();
        String ifn = fullName.substring(0, 1).toUpperCase();
        String iln = fullName.split(" ")[1].substring(0, 1).toUpperCase();
        System.out.println(ifn + iln);

        /* Username is "admin", Password is "pwd123" Ask user to enter username and password
        User should see "Enter your username and password" message If user enters correct credentials, he should get "You are in your account!" message
        Otherwise, he should see "Enter your username and password" message 3 times After 3 times he should get "Your account is blocked" message*/

        Scanner input = new Scanner(System.in);
        int counter = 0;
        do {
            if (counter == 3) {
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter your user name");
            String userName = input.next();

            System.out.println("Enter your password");
            String password = input.next();

            counter++;

            if (userName.equals("admin") && password.equals("pwd123")) {
                System.out.println("You are in your account");
                break;
            }


        } while (counter<4);
    }
}


