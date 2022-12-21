package tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        /*
        6.[Coding] In any programming language, write a function which checks if a given number is fullfilling all 3 conditions at the same time:
    it is Fibonacci number, odd number and prime number. Consider reading the number from user input.
        */

        checkNumberWhichGivenByUser();
    }

    // I USED INTELLIJ AS IDE AND I USED JAVA AS PROGRAMMING LANGUAGE AND THIS METHOD BELONG TO ME
    // IF YOU WANT I CAN EXPLAIN EVERY PART OF THIS METHOD I WROTE THIS METHOD IN 30 MINUTES
    public static void checkNumberWhichGivenByUser() {
        int num = 0;
        int counter = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to check if it is fullfilling all three conditions at the same time: Is it fibonacci number, odd number and prime number)");
        num = scan.nextInt();

        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;

        if (num % 2 == 1) {
            flag1 = true;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }

        if (counter == 2) {
            flag2 = true;
        }

        List<Integer> fibonacciList = new ArrayList<>();
        int fibo1 = 1;
        int fibo2 = 1;
        fibonacciList.add(fibo1);
        fibonacciList.add(fibo2);
        int fibonacci = 0;
        for (int j = 1; j <= num; j++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            if (!fibonacciList.contains(fibonacci)) {
                fibonacciList.add(fibonacci);
            }
        }

        if (fibonacciList.contains(num)) {
            flag3 = true;
        }


        if (flag1 == true && flag2 == true && flag3 == true) {
            System.out.println(num + " is fullfilling all 3 conditions at the same time: It is Fibonacci number, odd number and prime number");
        } else {
            System.out.println(num + " is not fullfilling all 3 conditions at the same time");
        }
    }
}
