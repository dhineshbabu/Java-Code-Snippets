package general_programming;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current time is "+ current );
    }
}
