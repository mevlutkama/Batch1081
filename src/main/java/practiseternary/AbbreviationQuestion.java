package practiseternary;

import java.util.Scanner;

public class AbbreviationQuestion {
    public static void main(String[] args) {
        /*Ask user to enter a String. If the String has 2 characters, output will be  “It is valid for state abbreviations”
        Otherwise, output will be “It is not valid for state abbreviations”*/
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String");
        String s= input.next();
        String abb=s.length()==2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
        System.out.println(abb);


    }
}
