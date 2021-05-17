package scratchpad;

import java.time.LocalDate;
import java.util.Date;

public class TestIt {

    public static void main(String[] args) {
        char a = 'A';
//        System.out.println("This is from intellij");
        int number = 100;
        double number1 = 10.23;
        String name = "Dhinesh";
        Date date = new Date();
        System.out.println(date.toString());
        byte theByte = -128;
        short theShort = 89;
        long theLong = 343_43_4L; // either lower or upper case l
        boolean isAdult = true;

        //Reference Types
        String theName = new String("Dhinesh");
//        System.out.println(theName.toLowerCase());

        LocalDate now = LocalDate.now();
//        System.out.println(now.getDayOfMonth());


    }
}
