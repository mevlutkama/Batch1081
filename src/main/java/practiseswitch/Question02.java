package practiseswitch;

import java.util.Scanner;

public class Question02 {
    public static void main(String[] args) {
        /*Write a Java program user will choose answer among A, B, C, or D. If the answer is true, output will be “True.”
        If the answer is false, output will be “False”. Correct answer is ‘C’ for the multiple option question.*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the answer among A, B, C, D please");
        char answer = input.next().toUpperCase().charAt(0);
        switch (answer) {
            case 'A':
            case 'B':
            case 'D':
                System.out.println("False");
                break;
            case 'C':
                System.out.println("True");
                break;
            default:
                System.out.println("Enter a valid option please");
        }
    }
}
