package itjavaquestionbank8;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateClass {
    public static void main(String[] args) {
        //Type the code that finds out how many days Ali lived. Date of birth of Ali is 12th of May 2002
        /*LocalDate ld = LocalDate.now();
        LocalDate dobAli = LocalDate.of(2015, Month.JUNE,28);
        long days = ChronoUnit.DAYS.between(dobAli,ld);
        System.out.println(days);*/

        //Type the code that finds out how many months Ali lived. Date of birth of Ali is 4th of June 1997
        /*LocalDate ld = LocalDate.now();
        LocalDate dobOfAli = LocalDate.of(1997,6,4);
        long months = ChronoUnit.MONTHS.between(dobOfAli,ld);
        System.out.println(months);*/

        //Date of birth of Ali is of June 1997. Type code to find the exact date 2 years, 3 months, and 12 days after Ali's birth date.
        /*LocalDate dobAli = LocalDate.of(1997, Month.JUNE,4);
        LocalDate date = dobAli.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(date);*/

        /*Ali was born 45 years, 8 months and 5 days after 29 October 1923. Veli was born 24 years, 2 months and 11 days before 15 September 1993.
Type code to calculate the exact date of birth of Ali and Veli. Type code to check if the date of birth of Ali and Veli is the same or not. */
       /*LocalDate dobAli = LocalDate.of(1923,Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dobVeli = LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobAli);
        System.out.println(dobVeli);
        boolean isSame = dobAli.equals(dobVeli);
        System.out.println(isSame);*/

        //Veli was born 3 years and 11 days after Ali. Ali gave you his date of birth as 24th of November 2012 Type code to calculate Veli’s date of birth.
        /*LocalDate dobAli = LocalDate.parse("2012-11-24");
        LocalDate dobVeli = dobAli.plusYears(3).plusDays(11);
        System.out.println(dobVeli); */

        //Create a Date Value for your birth date and create Date Value for your kid's birth date then calculate the difference in days.
        /*LocalDate dobOfMe = LocalDate.of(1988,5,2);
        LocalDate dobOfYavuz = LocalDate.of(2015,6,28);
        long diff = ChronoUnit.YEARS.between(dobOfMe,dobOfYavuz);
        System.out.println(diff);*/

        //Get the last 2 digits of the year in current date
        /*LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy");
        String formattedDate = dtf.format(currentDate);
        System.out.println(formattedDate);
        int x = currentDate.getYear()%100;
        System.out.println(x);*/

        /*Type code to check if a given year is “Leap year” or not Leap Year:
        i) If a year is divisible by 100 and divisible by 400 it is called leap year. For example; 2000 is, 1900 is not
        ii) If a year is not divisible by 100 and divisible by 4 it is called leap year. For example; 2004 is, 2007 is not  */
        //int year = 1997;
        //String res = year %100==0 ? (year %400 == 0 ? "Lucky Leap Year" : "Not Lucky Leap Year") : (year%4==0 ? "Simple Leap Year" : "Not Simple Leap Year");
        /*LocalDate myDob = LocalDate.of(1988,5,2);
        boolean isLeap = myDob.isLeapYear();
        System.out.println(isLeap);*/

        //Find the sum of the month numbers of two different dates
       /*LocalDate dovY = LocalDate.of(2015,6,28);
        LocalDate dovO = LocalDate.of(2019,10,14);
        System.out.println("The sum is: "+dovY.getMonth() + dovO.getMonth());*/

        //Find the difference in hours for two different dates
        /*LocalDate dovY = LocalDate.of(2015,6,28);
        LocalDate dovO = LocalDate.of(2019,10,14);
        long difference = ChronoUnit.DAYS.between(dovY,dovO);
        System.out.println("The difference in hours is: " + difference);*/
    }
}
