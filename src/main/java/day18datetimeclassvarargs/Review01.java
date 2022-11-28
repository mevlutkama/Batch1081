package day18datetimeclassvarargs;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Review01 {
    public static void main(String[] args) {
        LocalDate currentDate=LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDate currentDateInJapan = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);

        LocalDateTime currentDateTimeInEngland = LocalDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(currentDateTimeInEngland);

        LocalDate cd1 = LocalDate.now();
        LocalDate cd1Next = cd1.plusDays(120).plusYears(2).plusMonths(5);
        System.out.println(cd1Next);

        LocalDate cd1Past = cd1.minusYears(5).minusMonths(3).minusDays(25);
        System.out.println(cd1Past);

        LocalTime ct1 = LocalTime.now();
        int hour = ct1.getHour();
        System.out.println(hour);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        String formattedDateTime= dtf.format(cd1);
        System.out.println(formattedDateTime);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");
        LocalTime lt = LocalTime.now();
        String formattedTime = dtf1.format(lt);
        System.out.println(formattedTime);

        LocalDate dob1 = LocalDate.of(2002,10,12);
        LocalDate dob2 = LocalDate.of(2013, Month.MAY,21);

        boolean isBefore=dob1.isBefore(dob2);
        System.out.println(isBefore);

        LocalDate dobAli = LocalDate.of(1997,Month.JUNE,4);
        LocalDate current = LocalDate.now();
        long numOfMonths=ChronoUnit.MONTHS.between(dobAli,current);
        System.out.println(numOfMonths);

        LocalDate dobTom = LocalDate.of(1923,Month.OCTOBER,29).plusYears(45).plusMonths(8).plusDays(5);
        LocalDate dobVeli = LocalDate.of(1993,Month.SEPTEMBER,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dobTom);
        System.out.println(dobVeli);

        boolean isSame = dobTom.isEqual(dobVeli);
        System.out.println(isSame);








    }
}
