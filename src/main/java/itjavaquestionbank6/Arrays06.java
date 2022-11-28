package itjavaquestionbank6;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays06 {
    public static void main(String[] args) {
        /*) Ask user to enter 2 Strings. If the characters and the numbers of characters of the Strings are the same then print "Anagram" on the console.
        Otherwise, print "Not Anagram" on the console. Ignore cases. For example; "Mary" and "army" and "RAMY" are Anagrams.*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two Strings please");
        String s= scan.next().toLowerCase();
        String p= scan.next().toLowerCase();
        String arr[]=s.split("");
        String brr[]=p.split("");
        Arrays.sort(arr);
        Arrays.sort(brr);
        if (Arrays.equals(arr,brr)){
            System.out.println("ANAGRAM");
        }else {
            System.out.println("NOT ANAGRAM");
        }
    }
}
