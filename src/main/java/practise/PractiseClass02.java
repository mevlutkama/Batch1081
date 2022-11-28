package practise;

import java.util.Scanner;

public class PractiseClass02 {
    public static void main(String[] args) {
        /*Example 15: Type a program like; Ask user to enter two integer values, the first will be greater than the second.
                      The remainder when you divide the first by the second will be the width, and the sum of the two numbers
                      will be the length of a rectangle. Then calculate the area and the perimeter of the rectangle, and print them
                      on the console.*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 integers but first greater plese: ");
        int i=input.nextInt();
        int j=input.nextInt();
        int width=i%j;
        int length=i+j;
        System.out.println("The ares of rectangle: "+width*length);
        System.out.println("The perimeter of rectangle: "+2*(width+length));

        /*Example 16: Ask user to enter two integer values. Write a Java Program to swap two numbers by using the third variable.*/
        System.out.println("Enter 2 integers please: ");
        int a=input.nextInt();
        int b=input.nextInt();
        System.out.println("Before swap: "+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swap: "+a+" "+b);

        /*Example 17: Ask user to enter two integer values. Write a Java Program to swap two numbers without using the third variable.*/
        int k=10;
        int m=20;
        System.out.println("Before Swap: "+"k: "+k+" m: "+m);
        k=k+m;
        m=k-m;
        k=k-m;
        System.out.println("After Swap: "+"k: "+k+" m: "+m);
    }
}
