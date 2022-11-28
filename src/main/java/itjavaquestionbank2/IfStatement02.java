package itjavaquestionbank2;

public class IfStatement02 {
    public static void main(String[] args) {
        //Type code to print the name of the month when you entered the number of the month. Example; For 1 output is "January", for 2 output is "February" etc.
        int i = 12;
        if (i == 1) {
            System.out.println("january");
        } else if (i == 2) {
            System.out.println("february");
        } else if (i == 3) {
            System.out.println("march");
        } else if (i == 4) {
            System.out.println("april");
        } else if (i == 5) {
            System.out.println("may");
        } else if (i == 6) {
            System.out.println("june");
        } else if (i == 7) {
            System.out.println("july");
        } else if (i == 8) {
            System.out.println("august");
        } else if (i == 9) {
            System.out.println("september");
        } else if (i == 10) {
            System.out.println("october");
        } else if (i == 11) {
            System.out.println("november");
        } else if (i == 12) {
            System.out.println("december");
        } else {
            System.out.println("Invalid month number");
        }

        /*Type code to print    a) "Isosceles Triangle" if two sides of a triangle are equal in length.
                                b) "Equilateral Triangle" if all sides of a triangle are equal in length.
                                c) "Neither isosceles, nor equilateral" if a and b conditions are not satisfied*/
        int a = 15, b = 15, c = 15;
        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else {
            System.out.println("Neither isosceles, nor equilateral");
        }

        /*Type code to create a converter which converts mile to km, second to hour, fahrenheit to celsius. Find the formulas for conversions from Google.
        a) When user entered 10 and mileToKm String, your code should print "16 km"(The number will be dynamic) on the console
        b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The number will be dynamic) on the console
        c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333 celsius"(The number will be dynamic) on the console */

         double mile=10,seconds=7200,fahrenheit=68;
         String operator="fahrenheitToCelcius";
         if (operator.equals("mileToKm")){
             System.out.println(mile*1.60934);
         } else if (operator.equals("secondsToHours")) {
             System.out.println((seconds/60)/60);
         } else if (operator.equals(("fahrenheitToCelcius"))) {
             System.out.println((fahrenheit-32)*5/9);
         }
    }
}

