package slides1;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Type java code by using while loop, Write a program to count the factors of an integer which is entered by user.
        int a=24;
        int i=1;
        int counter=0;
        while (i<=a){
            if (a%i==0){
                counter++;
            }
            i++;
        }
        System.out.println(counter);
        System.out.println();

        /*Type java code by using while loop, Write a program that prompts the user to input an integer.
        It should then find sum of the digits of that number.*/
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter an integer to find sum of digits");
        int num= scan.nextInt();

        int j=num;
        int sumOfDigits=0;
        while (j>0){
            sumOfDigits=sumOfDigits+j%10;
            j/=10;
        }
        System.out.println(sumOfDigits);
    }
}
