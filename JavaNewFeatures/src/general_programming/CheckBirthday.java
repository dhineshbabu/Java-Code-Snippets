package general_programming;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;

public class CheckBirthday {
    public static void main(String[] args) {
        int birthday = 23;
        Month birthMonth = Month.SEPTEMBER;

        int todayDate = LocalDate.now().getDayOfMonth();
        Month thisMonth = LocalDate.now().getMonth();

        if(birthday==todayDate && birthMonth==birthMonth) {
            System.out.println("Happy Birthday");
        } else {
            System.out.println("Today is not my birthday");
        }

    }
}
