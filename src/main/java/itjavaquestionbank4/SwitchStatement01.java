package itjavaquestionbank4;

public class SwitchStatement01 {
    public static void main(String[] args) {
        /*Use switch statement to print a) "Winter" for December, January, February
                                        b) "Spring" for March, April, May
                                        c) "Summer" for June, July, August
                                        d) "Fall" for September, October, November
                                        e) "Invalid month name" for all the others*/
        String monthName = "may".toLowerCase();
        switch (monthName) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month name");
                break;
        }
        int i = 13;
        switch (i) {
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }
        // Type a code which prints the all month names starting with the given month numbers.
        // Example: If the month number is 9 output will be September October November December
        int j = 9;
        switch (j) {
            case 1:
                System.out.print("january ");
            case 2:
                System.out.print("february ");
            case 3:
                System.out.print("march ");
            case 4:
                System.out.print("april ");
            case 5:
                System.out.print("may ");
            case 6:
                System.out.print("june ");
            case 7:
                System.out.print("july ");
            case 8:
                System.out.print("august ");
            case 9:
                System.out.print("september ");
            case 10:
                System.out.print("october ");
            case 11:
                System.out.print("november ");
            case 12:
                System.out.print("december ");
                break;
            default:
                System.out.println("Invalid month number");
        }
        System.out.println();
        /*Print "Boy" if the gender is "Male" (Ignore cases) Print "Girl" if the gender is "Female" (Ignore cases)
          Print "Others" if the gender is different from "Male" and "Female"*/
        String gender = "Male".toLowerCase();
        switch (gender) {
            case "male":
                System.out.println("Boy");
                break;
            case "female":
                System.out.println("Girl");
                break;
            default:
                System.out.println("Others");
                break;
        }
        /*Type a code to display the number of days in a given month of a given year.
          Example: The number of days in February of 2000 was 29.*/
        int month = 3;
        int year = 2000;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
                break;
            default:
                System.out.println("Invalid month");
                break;
        }
    }
}
