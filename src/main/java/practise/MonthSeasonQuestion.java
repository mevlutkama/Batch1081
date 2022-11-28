package practise;

import java.util.Scanner;

public class MonthSeasonQuestion {
    public static void main(String[] args) {
        //Example 22: Type a code to print its season after getting a month from the user.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Month name please");
        String month = input.next().toLowerCase();
        if (month.equals("december") || month.equals("january") || month.equals("february")) {
            System.out.println("WINTER");
        } else if (month.equals("march") || month.equals("april") || month.equals("may")) {
            System.out.println("SPRING");
        } else if (month.equals("june") || month.equals("july") || month.equals("august")) {
            System.out.println("SUMMER");
        } else if (month.equals("september") || month.equals("october") || month.equals("november")) {
            System.out.println("AUTUMN");
        } else {
            System.out.println("Invalid month name");
        }
    }
}
