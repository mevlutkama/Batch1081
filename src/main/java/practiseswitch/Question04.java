package practiseswitch;

import java.util.Scanner;

public class Question04 {
    public static void main(String[] args) {
        /*Ask user ta enter one of the ‘U’, ’S’, and ‘A’. Then type a program by using “switch statement” to print “United” for ‘U’
”States” for ’S’, and “America” for ‘A’*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter among 'U','S','A'");
        char letter = scan.next().charAt(0);

        switch (letter) {
            case 'U':
                System.out.println("United");
                break;
            case 'S':
                System.out.println("States");
                break;
            case 'A':
                System.out.println("America");
                break;
            default:
                System.out.println("Invalid letter");
        }
    }
}
