package java8.datetimeapi;

import java.time.Year;

public class LeapYearValidation {
    public static void main(String[] args) {
        int n = 2010;
        Year y = Year.of(n);
        if(y.isLeap()) {
            System.out.printf("%d is leap year ", n);
        } else {
            System.out.printf("%d is not Leap year", n);
        }
    }
}
