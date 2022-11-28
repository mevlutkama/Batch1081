package itjavaquestionbank8;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeClass {
    public static void main(String[] args) {
        /*  If the hour is
            i) Between 24:00 and 05:00 then print ‘Sleeping time’ on the console
            ii) Between 08:00 and 16:00 then print ‘Working time’ on the console
            iii) Between 19:00 and 22:00 then print ‘Family time’ on the console
            iv) For the others print ‘Personal time’ on the console  */
        /*LocalTime ct = LocalTime.now();
        int i = ct.getHour();
        if (i > 0 && i < 5) {
            System.out.println("Sleeping Time");
        } else if (i > 8 && i < 16) {
            System.out.println("Working Time");
        } else if (i > 19 && i < 22) {
            System.out.println("Family Time");
        } else {
            System.out.println("Personal Time");
        } */

        //Type code to find time difference between Japan time zone and Germany time zone
        /*LocalDateTime ctInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(ctInJapan);
        LocalDateTime ctInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        System.out.println(ctInGermany);
        long difference = ChronoUnit.HOURS.between(ctInGermany,ctInJapan);
        System.out.println(difference); */

        /*Ali was born in Istanbul on 5th of February 2015 at 10:00 am TRT, Mark was born in the USA on 5th of February 2015 at 12:00 pm EST.
         What is the difference between Ali’s birth time and Mark’s birth time in hours? */
        /*LocalDateTime dobAli = LocalDateTime.of(2015,2,5,10,0,0);
        ZonedDateTime localDobAli = dobAli.atZone(ZoneId.of("Europe/Istanbul"));
        LocalDateTime dobMark = LocalDateTime.of(2015,2,5,12,0,0);
        ZonedDateTime localDobMark = dobMark.atZone(ZoneId.of("America/New_York"));
        long difference = ChronoUnit.HOURS.between(localDobAli,localDobMark);
        System.out.println(difference); */

        /*Ali was born on 5th of February 2015 at 10:15 am EST, Mark was born on 6th of March 2015 at 12:25 pm EST. Ali remained in intensive care
        for 23 hours and 35 minutes. Veli remained in intensive care for 1 hour and 12 minutes. What is the difference in minutes between the
        times of Ali and Veli leaving the intensive care unit? */
        /*LocalDateTime dobAli = LocalDateTime.of(2015,2,5,10,15,0);
        LocalDateTime dobVeli = LocalDateTime.of(2015,3,6,12,25,0);
        long difference = ChronoUnit.MINUTES.between(dobAli,dobVeli);
        System.out.println(difference);*/

        //Mark was born on 2/23/2018 at 3:25 PM in GMT. What is the exact birth date and time of Mark in Japan?
        /*LocalDateTime timeInJapam = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime timeInGmt = LocalDateTime.now(ZoneId.of("GMT"));
        long difference = ChronoUnit.HOURS.between(timeInGmt,timeInJapam);
        System.out.println(difference);
        LocalDateTime dobMark = LocalDateTime.of(2018,2,23,15,25,0).minusHours(difference);
        System.out.println("Date of Birth in Tokyo: "+dobMark);*/
    }
}
