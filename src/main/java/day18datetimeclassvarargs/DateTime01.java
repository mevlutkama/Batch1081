package day18datetimeclassvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {
        //How to get "current date" by typing Java code
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//2022-09-28

        //How to get "current time" by typing Java code
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);//08:47:49.241209900

        //How to get "current date and time" by typing Java code
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);//2022-09-28T08:47:49.241209900

        //How to get "current date" in another country by typing Java code
        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);//2022-09-28

        //How to get "current time" in another country by typing Java code
        LocalTime currentTimeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentTimeInJapan);//14:52:44.631696100

        //How to get "current date and time" in Japan by using Java code
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);//2022-09-28T14:54:50.621985300

        //How to go future in date
        LocalDate cd1 = LocalDate.now();
        System.out.println(cd1);//2022-09-28

        LocalDate cd1Next = cd1.plusYears(2).plusMonths(5).plusDays(120);//Method chain
        System.out.println(cd1Next);//2025-06-28

        //How to go past in date
        LocalDate cd1Past = cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);//2019-07-23

        //Homework: Type code to learn how to go future and past in time

        //How to get a specific part of time
        LocalTime ct1 = LocalTime.now();
        int hour = ct1.getHour();
        System.out.println(hour);//9

        int minute = ct1.getMinute();
        System.out.println(minute);//3

        //How to change the format of the date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");//Uppercase M is for months, lowercase m is for minutes
        String formattedCurrentDate = dtf.format(cd1);
        System.out.println(formattedCurrentDate);//28/09/2022

        DateTimeFormatter dt = DateTimeFormatter.ofPattern("dd/MMM/yy");// MMM gives you the "first 3 characters" of the month name
                                                                        // yy gives you the "last 2 digits" of the year
        String formattedCurrentDate2 = dt.format(cd1);
        System.out.println(formattedCurrentDate2);//28/Sep/22

        DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");// MMMM gives you full name of the month
        String formattedCurrentDate3 = d.format(cd1);
        System.out.println(formattedCurrentDate3);//28/September/2022

        //How to change the format of the time
        DateTimeFormatter mnr = DateTimeFormatter.ofPattern("hh:mm a");// hh uses 12 hours system, HH uses 24 hours system
                                                                       // "a" is for to display "AM" or "PM"
        LocalTime lt = LocalTime.now();
        String formattedCurrentTime = mnr.format(lt);
        System.out.println(formattedCurrentTime);// 09:16 AM

        /*Enum is something like class normally in a class you have variables and methods. In Enums you may have variables and methods as well.
        But when we create Enum we use it to store constant variables. Unchangeable variables. Like months...
        Whenever you need unchangeable variables use Enum.
        For example, you are creating for Honda - Honda has some models like Civic HRV ...
        their names will not change anytime honda civic exists for many years.
        If you are sure they will remain same for long time. You are creating application for Honda  you will use civic model many times in your
        application.
        You put them in Enum when you need models you go to Enum select it from there and use. You don't need to memorise model names.
        Go to Enum and get the one you need. When you create a value in Enum you can add values?
        For example, you are working with states in the USA create a enum and put states in it. Then you create method to get variables from that Enum.*/

        //How to create specific dates
        LocalDate dob1 = LocalDate.of(2012,3,13);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY,21);

        //How to compare two dates
        //In isBefore() method if the first date is before the second date you get true
        //Otherwise (equality and first is after) you will get galse
        boolean isBefore = dob1.isBefore(dob2);
        System.out.println(isBefore);//true

        boolean is = dob2.isBefore(dob1);
        System.out.println(is);//false



        boolean isAfter = dob2.isAfter(dob1);
        System.out.println(isAfter);//true
    }
}
