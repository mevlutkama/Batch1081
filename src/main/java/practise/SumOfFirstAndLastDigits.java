package practise;

import java.util.Scanner;

public class SumOfFirstAndLastDigits {
    public static void main(String[] args) {
        /*Ask user to enter a 4 digits integer, then print the sum of the first and the last digit of the number on console.
        For example; if user enters 1234 you will add 1 and 4, then print on the console 5*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4 digits number please");
        int num = input.nextInt();
        int firstDigit = num / 1000;
        int lastDigit = num % 10;
        System.out.println("The sum of first and last digits of numbers: " + (firstDigit + lastDigit));
    }
}
