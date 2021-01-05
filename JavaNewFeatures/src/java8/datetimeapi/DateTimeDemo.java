package java8.datetimeapi;

import java.time.*;
import java.time.zone.ZoneRules;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        //Extracting other values from the date object
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yy = date.getYear();
        System.out.println("dd " + dd + "mm " + mm + "yy " + yy);
        LocalTime time = LocalTime.now();
        System.out.println(time);
        //Extracting other values from time object
        int h = time.getHour();
        int m = time.getMinute();
        int s = time.getSecond();
        int n = time.getNano();
        System.out.println("Printing time details");
        System.out.printf("\n%d:%d:%d:%d",h,m,s,n);
        // To get both date and time values
        LocalDateTime dtime = LocalDateTime.now();
        System.out.println(dtime);
        LocalDateTime newTime = LocalDateTime.of(1995,04,28,12,45);
        System.out.println("Printing customized date time details..");
        System.out.println(newTime);
        System.out.println("After 6 months "+ newTime.plusMonths(6));
        System.out.println("Before 6 months " + newTime.minusMonths(6));

        //Zone details
        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);

        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime lazt = ZonedDateTime.now(la);
        System.out.println(lazt);

        //Period Object
        LocalDate  today = LocalDate.now();
        LocalDate birthday = LocalDate.of(1989,06,15);
        Period pd = Period.between(birthday, today);
        System.out.printf("Age is %d, months %d, days %d", pd.getYears(), pd.getMonths(), pd.getDays());

    }
}
