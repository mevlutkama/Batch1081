package reviewquestions;

import java.util.Scanner;

public class InverseQuestion {
    public static void main(String[] args) {
        /*Ask user to enter a word which has 4 letters and output will be inverse of the word.
        For example; if user enters “MARK” output will be “KRAM”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word which has 4 letters please");
        String word = input.next();
        System.out.println("" + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        System.out.println(word.substring(3) + word.substring(2, 3) + word.substring(1, 2) + word.substring(0, 1));
    }
}
