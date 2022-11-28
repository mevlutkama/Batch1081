package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Review02 {
    public static void main(String[] args) {
        //Example 1: 09/20/2022 is given, print the date like "Month:09   Day:20  Year:2022"
        String date="09/20/2022";
        String dateArr[]=date.split("/");//[09, 20, 2022]
        System.out.print("Month:"+dateArr[0]+" ");
        System.out.print("Day:"+dateArr[1]+" ");
        System.out.print("Year:"+dateArr[2]);

        System.out.println();

        //Example 2: Get String from user and type code to find the number of words in the String.
        //          "I like to move it, move it" ==> 7
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str= scan.nextLine();

        String sen[]=str.split(" ");
        int totalWords=sen.length;
        System.out.println("There are "+totalWords+" words in your sentence");

        System.out.println();

        //Example 3: Count the number of words start with "a" in the String
        int counter=0;
        for (String w : sen) {
            if (w.startsWith("a")){
                counter++;
            }
        }
        System.out.println("There are "+counter+ " words start with a");

        System.out.println();

        //Example 4: Type code to find the longest word in sentence
        String s="I want to go to university to learn more";
        String arr[]=s.split(" ");

        Arrays.sort(arr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);

    }
}
