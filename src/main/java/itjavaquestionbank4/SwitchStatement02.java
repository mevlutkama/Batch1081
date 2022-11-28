package itjavaquestionbank4;

public class SwitchStatement02 {
    public static void main(String[] args) {
        /*Use switch statement to create a simple calculator which does addition, subtraction, multiplication, and division with any 2 numbers
        a) When user entered 10.2 and 5 and + sign your code should print "The result is 15.2" on the console
        b) When user entered 10 and 5 and - sign your code should print "The result is 5.0" on the console
        c) When user entered 10 and 5.3 and * sign your code should print "The result is 53.0" on the console
        d) When user entered 10 and -5 and / sign your code should print "The result is -2.0" on the console
        e) When user entered 10 and -5 and operation different from +, -, *, / your code should print
            "That operation cannot be done" */
        /*double a = 10.2;
        double b = 5;
        char operator = '+';
        switch (operator) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("Invalid Operator");
                break;
        }*/

        /*Use switch statement to create a converter which converts mile to km, second to hour, fahrenheit to celsius. Find the formulas for conversions
        from Google.
        a) When user entered 10 and mileToKm String, your code should print "16 km" (The number will be dynamic) on the console
        b) When user entered 7200 and secondsToHours String, your code should print "2 Hours"(The number will be dynamic) on the console
        c) When user entered 83 and fahrenheitToCelsius String, your code should print "28.3333 celsius"(The number will be dynamic) on the console
        d) When user entered operation different from mileToKm, secondsToHours, fahrenheitToCelsius your code should print "That operation was not defined for that converter"
        */
        /*double mile = 10;
        double seconds = 7200;
        double fahrenheit = 62;
        String operator2 = "fahrenheitToCelsius";
        switch (operator2) {
            case "mileToKm":
                System.out.println(mile * 1.60934);
                break;
            case "secondsToHours":
                System.out.println((seconds / 60) / 60);
                break;
            case "fahrenheitToCelsius":
                System.out.println((fahrenheit - 32) * 5 / 9);
                break;
            default:
                System.out.println("That operation was not defined for that converter");
        } */

       /* String browser = Browsers.FIREFOX.toString();
        switch (browser){
            case "CHROME":
                System.out.println("I'm using CHROME");
                break;
            case "SAFARI":
                System.out.println("I'm using SAFARI");
                break;
            case "IE":
                System.out.println("I'm using IE");
                break;
            case "FIREFOX":
                System.out.println("I'm using FIREFOX");
                break;
            case "YANDEX":
                System.out.println("I'm using YANDEX");
                break;
            default:
                System.out.println("It is not valid browser");
        }*/

        /*String season = Seasons.FALL.toString();
        switch (season){
            case "WINTER":
                System.out.println("SNOWBOARDING");
                break;
            case "SUMMER":
            case "SPRING":
                System.out.println("FISHING");
                break;
            case "FALL":
                System.out.println("TREKKING");
                break;
            default:
                System.out.println("Undefined Season");
        } */

        /*Create a method which gives you a random alphabetical character in myClass Class then print the following by using the method.
                Print "First Character" for 'A' and 'a'
                Print "Second Character" for 'B' and 'b'
                Print "Third Character" for 'C' and 'c'
                Print "Forth Character" for 'D' and 'd'
                Print "Other Characters" for all others*/
       /*String alphabet = "z".toLowerCase();
        switch (alphabet){
            case "a":
                System.out.println("First Character");
                break;
            case "b":
                System.out.println("Second Character");
                break;
            case "c":
                System.out.println("Third Character");
                break;
            case "d":
                System.out.println("Fourth Character");
                break;
            default:
                System.out.println("Other Characters");
        }

    }*/
   /* public static String getRandomAlphabet(){
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        int maxIndex = alphabets.length()-1;
        int randomIndex = (int)Math.round(Math.random()*maxIndex);
        return alphabets.substring(randomIndex,randomIndex+1);*/
    }
}
