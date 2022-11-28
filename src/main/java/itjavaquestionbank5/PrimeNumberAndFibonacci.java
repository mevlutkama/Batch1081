package itjavaquestionbank5;

import java.util.Scanner;

public class PrimeNumberAndFibonacci {
    public static void main(String[] args) {
        /*  Ask the user to enter an integer to check if it is a prime number or not. Example: if user enters 43 output will be “43 is a prime number”,
        if user enters 120 output will be “120 is not a prime number”, if user enters negative integers output will be “Enter a positive integer”*/
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or not");
        int num = scan.nextInt();
        int counter = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }*/

        /*  Ask the user how many fibonacci numbers he wants to see. Then write the code that prints these fibonacci numbers.
        Example: if user enters 6 output will be 1 1 2 3 5 8*/
       /* System.out.println("How many fibonacci numbers do you want to see?");
        int number= scan.nextInt();
        int fibo1=1;
        int fibo2=1;
        int fibonacci=0;
        System.out.print(fibo1+" ");
        System.out.print(fibo2+" ");

        for (int j=1;j<number-1;j++){
            fibonacci=fibo1+fibo2;
            fibo1=fibo2;
            fibo2 = fibonacci;
            System.out.print(fibonacci+" ");
        }*/

        //Type a code that prints all prime numbers less than a given number. Example: if user enters 20 output will be 2, 3, 5, 7, 11, 13, 17, 19
       // int num = 87;
        //printPrime(num);


    }
    /*public static void printPrime(int n){
        for (int i=2;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static boolean isPrime(int n){
        if (n<=1){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }*/

}

