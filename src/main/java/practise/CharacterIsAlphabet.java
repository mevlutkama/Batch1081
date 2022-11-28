package practise;

import java.util.Scanner;

public class CharacterIsAlphabet {
    public static void main(String[] args) {
        /* Example 27: Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
                    then output will be “Hey man you retired!” else output will be “No need to work”*/
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age and gender please");
        int age = input.nextInt();
        String gender = input.next();
        if (age > 65 && gender.equalsIgnoreCase("male")) {
            System.out.println("Hey man you retired");
        } else {
            System.out.println("No need to work");
        }

        /* Example 28: Ask user to enter a character, then check whether the character is alphabet or not*/
        System.out.println("Enter a character please");
        char c= input.next().charAt(0);
        if ((c>='a' && c<='z') || (c>='A' && c<='Z')) {
            System.out.println("Alphabet");
        } else {
            System.out.println("Not alphabet");
        }
    }
}
