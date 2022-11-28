package day06stringmanipulations;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        /*//Ask user to enter a 3 digits integer then find the sum of the digits.User ın girdiği numberda rakamlar toplamı?
        /*For Ex; when the user enters 237 into the system we should first use modulus method like; 237%10= 7 and then*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a 3 digits integer please");
        int i= scan.nextInt();

        int lastDigit=i%10;
        int middleDigit=(i/10)%10;
        int firstDigit=i/100;
        System.out.println("The sum of digits: "+ (lastDigit+middleDigit+firstDigit));
    }
}
