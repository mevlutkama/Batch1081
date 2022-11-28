package practiseswitch;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        /*If the user pressed 1, 2, 3 the program will print the number that is pressed;otherwise, program will print "Not allowed".*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number please");
        int num = input.nextInt();
        switch (num) {
            case 1:
                System.out.println(num);
                break;
            case 2:
                System.out.println(num);
                break;
            case 3:
                System.out.println(num);
                break;
            default:
                System.out.println("Not allowed");
        }
    }
}
