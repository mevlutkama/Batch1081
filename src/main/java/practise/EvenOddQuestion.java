package practise;

import java.util.Scanner;

public class EvenOddQuestion {
    public static void main(String[] args) {
        /*Example 23:Type java code, if an integer is even, output will be “The integer is even”.
                     If the integer is odd, output will be “The integer is odd”.*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an integer please");
        int num= input.nextInt();
        if (num % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        /*Example 24: Type java code by using if statement. When you enter the initial of the day of a week,
                      output should be all possible names of the days.
                      For example; if the initial is ’S’ output should be “Saturday or Sunday”*/
        String s="W";
        String il=s.toLowerCase();
        if (il.equals("m")) {
            System.out.println("Monday");
        } else if (il.equals("t")) {
            System.out.println("Tuesday or Thursday");
        } else if (il.equals("w")) {
            System.out.println("Wednesday");
        } else if (il.equals("f")) {
            System.out.println("Friday");
        } else if (il.equals("s")) {
            System.out.println("Saturday or Sunday");
        } else {
            System.out.println("Invalid initial letter");
        }
    }
}
