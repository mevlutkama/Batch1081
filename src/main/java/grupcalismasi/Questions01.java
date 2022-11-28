package grupcalismasi;

import java.util.Scanner;

public class Questions01 {
    public static void main(String[] args) {
        //find the number of elements in a multidimensional array.  //Example:{ {2,3}, {12}, {21,34,56}, {4}}
        /*int arr[][] = {{2, 3}, {12}, {21, 34, 56}, {4}};
        int sum = 0;
        for (int[] w : arr) {
            sum = sum + w.length;
        }
        System.out.println(sum);*/
       /* int num = 500;
        byte num = (byte) num;
        System.out.println(num); */
        /*int y = -16;
        int z = -7;
       int res = y<2 ? y <-1 ? z <-5 ? y <-1 ? z<5 ? 4 : 10 : -2 :  8 : 7  : 10;
        System.out.println(res);*/

       /* for (int i=1; i<11; i++){
            for (int k=1; k<11; k++){
                System.out.print(i+"*"+k+"="+(i*k)+"\t\t");
            }
            System.out.println();
        }*/

        //Type code to find sum of the numbers from 3 to 12, except 5
       /*int sum = 0;
        for (int i = 3;i<13;i++){
            if (i==5){
                continue;
            }
            sum=sum+i;
        }
        System.out.println(sum);*/

        /* Check PERFECT NUMBER using for Loop A perfect number is a number that is equal to the sum of its positive divisors
(excluding the number itself). For example, 6, 28, 496 etc. are perfect number */

      /*  int i = 28;
        int sum = 0;
        for (int k=1; k<i; k++){
            if (i%k==0){
                sum= sum+k;
            }
        }
        if (sum==i){
            System.out.println("Perfect Number");
        }else {
            System.out.println("Not Perfect Number");
        }*/

        /*  Two numbers are entered through the keyboard. Write a program to find
            the value of one number raised to the power of another. (Do not use Java built-in method)
            base=2-->power 3-->result = 2*2*2=8  */


        /* Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
        (kullanicidan ard arada sayi isteyecegiz, kendisi cikis yapmak isteyene kadar sayilari almaya devam edecegiz.
        En son ekrana girdigi cift sayilarin toplamini verecegiz. ardindan girdigi negatif sayilarin toplamini verecegiz.
        */


        /*
        From a given array find all pairs whose sum is a given number {4, 6, 5, -10, 8, 5, 20} ==> 10
        For example;   4+6=10, 5+5=10, -10+20=10
         */
       /* int sum = 10;
        int a [] = {4,6,5,-10,8,5,20};

            for (int w:a){
                for(int i=0;i<a.length;i++){
                    if (w+a[i]==10)
                    System.out.print(a[i]+"+"+w+"="+(a[i]+w)+" ");
                }
            }*/
     /*  int rows = 5;

        for (int i=1;i<rows+1;i++){
            for (int k = 1;k<=i;k++){
                System.out.print(i+k-1+" ");
            }
            System.out.println();
        } */

        // Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name.
       /* Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.nextLine();

        System.out.println("Enter the character you want to count");
        char ch = input.next().charAt(0);

        int counter = 0;
        int i = 0;

        while(i<name.length()){

            if (name.charAt(i) == ch) {
                counter++;
            }
            i++;
        }
        System.out.println("There is "+counter+" "+ch+" in the name");*/

    }
}




