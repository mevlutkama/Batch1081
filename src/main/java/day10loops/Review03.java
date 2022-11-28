package day10loops;

import java.util.Scanner;

public class Review03 {
    public static void main(String[] args) {
        //while-loop ==> zero execution is possible
        //when you use do-while loop, zero execution is impossible, loop body will be executed at least for once
        //if it is mandatory to execute the code inside the loop body at least once, use do-while loop.
        int k=1;
        do {
            System.out.println("do-while loop");
            k++;
        }while (k<1);
        /*      Example 1: Ask user to enter an integer.
                If the integer is less than 100, tell user "Won!"
                Otherwise, tell user "Lost!"*/
        Scanner scan=new Scanner(System.in);
        int num=0;
        do {
            System.out.println("Enter a number to play");
            num= scan.nextInt();
            if (num<100){
                System.out.println("WON!!!");
            }
        }while (num<100);
        System.out.println("LOST!!!");
        //Infinite loops
        //Note : If you do mistake in increment or decrement part, the loop will be infinite loop. Do not create infinite loop.
        int r=0;
        while (true){
            System.out.println("Hi!");
            r++;
            if (r==5){
                break;
            }
        }

    }
}
