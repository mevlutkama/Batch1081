package reviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        /*Ask user to enter an integer, if it is less than 10, calculate its square and print it on the console.
If it is greater than 10 multiply it by 2 and print it on the console. Otherwise keep the number same and print it on the console.*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer please");
        int i = scan.nextInt();

        if (i < 10) {
            System.out.println(i * i);
        } else if (i > 10) {
            System.out.println(i * 2);
        } else {
            System.out.println(i);
        }
        int res=i<10 ? (i*i) : i*2;
        System.out.println(res);
    }

}
