package grupcalismasi;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Question 1)Type the code to print number by increasing 3 starting from 10 up to 61 61 will be included
        /*int i = 10;
        while (i<62){
            System.out.print(i+" ");
            i+=3;
        }*/

        /*Type code to print to reverse a String  i)by using loop
                                                  ii)by using a method from StringBuilder Class
                                                  String str = "Tom Hanks";  ==> "sknaH moT"
        /*String str = "Tom Hanks";
        String reverse = "";
        for (int i=str.length()-1;i>-1;i--){
            String s = str.substring(i,i+1);
            reverse=reverse+s;
        }
        System.out.println(reverse);*/
       /* StringBuilder str = new StringBuilder("Tom Hanks");
        StringBuilder str1 = str.reverse();
        System.out.println(str1);*/

        //Type code to find the sum of the digits of an Integer by using loop int n = -3558;   ==> 3+5+5+8=21
        /*int n = -3558;
        n=Math.abs(n);
        int sum = 0;
        for (int i=n;i>0;i/=10){
            sum=sum+i%10;
        }
        System.out.println(sum);*/

        //Type code to print characters before the last occurrence of "p" in a String String str = "Mississippi";   Output ==> "Mississip"
       /* String s= "Mississippi";
        int i = 0;
        while (i<s.lastIndexOf("p")){
            System.out.print(s.charAt(i));
            i++;
        }*/
        //Ask user to enter a positive integer and then find and print  the sum of the digits of that number by using while loop
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer please");
        int num = scan.nextInt();
        int sum = 0;
        while (num>0){
            sum=sum+num%10;
            num/=10;
        }
        System.out.println(sum);*/
        //Ask user to type a positive  Integer and type code to find the sum of the unique digits of that integer
        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer please");
        String num = scan.next();
        int sum = 0;

        for (int i=0;i<num.length();i++){
            String s = num.substring(i,i+1);
            if (num.indexOf(s)==num.lastIndexOf(s)){
                sum=sum+Integer.valueOf(s);
            }
        }
        System.out.println(sum);*/

        /*Ask user to enter an integer and then type a code that prints all prime numbers less than a given number.
          Example: If user enters 20 output will be 2, 3, 5, 7, 11, 13, 17, 19*/
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

        //Type code to print repeated characters in a String by using while loop Example: String str = "accessories";   ==>  ces
    /*String str = "accessories";
    String repeated="";
    int i = 0;
    while (i<str.length()){
        String p=str.substring(i,i+1);
        if (str.indexOf(p)!=str.lastIndexOf(p) && !repeated.contains(p))
            repeated=repeated+p;
        i++;
    }
        System.out.println(repeated);*/
    }
}
